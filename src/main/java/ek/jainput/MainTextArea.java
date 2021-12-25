package ek.jainput;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import ek.jainput.proc.HiraganaKeyProcessor;
import ek.jainput.proc.KanjiKeyProcessor;
import ek.jainput.proc.KeyProcessor;


public class MainTextArea extends JTextArea 
    implements KeyListener, KeyProcessor.Callback
{
    public static enum KbMode { Hiragana, Katakana, Kanji };
    
    public static interface KbModeListener
    {
        public void onSetKbMode(KbMode mode);
    }
    
    
    private KbModeListener kbModeListener;
    private HiraganaKeyProcessor hiraProc;
    private KanjiKeyProcessor kanjiProc;
    private KeyProcessor keyProc;
    
    
    public MainTextArea(Font font)
    {
        setColumns(20);
        setRows(3);
        setLineWrap(true);
        setFont(font);

        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK), "none");
        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_K, KeyEvent.CTRL_DOWN_MASK), "none");
        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_J, KeyEvent.CTRL_DOWN_MASK), "none");
        
        addKeyListener(this);
        hiraProc = new HiraganaKeyProcessor(this);
        kanjiProc = new KanjiKeyProcessor(this);
        keyProc = hiraProc;
    }
    
    
    public void setKbModeListener(KbModeListener listener)
    {
        this.kbModeListener = listener;
    }
    
    
    @Override
    public void keyTyped(KeyEvent e)
    {
        char ch = e.getKeyChar();
        boolean controlDown = e.isControlDown();
        e.consume();
        
        if(controlDown)
        {
            switch(ch)
            {
            // Ctrl-J
            case 10:
                keyProc = kanjiProc;
                if(kbModeListener != null) kbModeListener.onSetKbMode(KbMode.Kanji);
                break;
            // Ctrl-H
            case 8:
                keyProc = hiraProc;
                if(kbModeListener != null) kbModeListener.onSetKbMode(KbMode.Hiragana);
                break;
            // Ctrl-K
            case 11:
                keyProc = hiraProc;
                if(kbModeListener != null) kbModeListener.onSetKbMode(KbMode.Katakana);
                break;
            }
        }
        else
        {
            keyProc.processKey(ch);
        }
    }

    
    @Override
    public void keyPressed(KeyEvent e)
    {
    }

    
    @Override
    public void keyReleased(KeyEvent e)
    {
    }
    
    
    @Override
    public void onText(String str)
    {
        replaceSelection("");
        insert(str, getCaretPosition());
    }

}
