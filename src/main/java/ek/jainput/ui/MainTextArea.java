package ek.jainput.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultEditorKit;

import ek.jainput.proc.HiraganaKeyProcessor;
import ek.jainput.proc.KanjiKeyProcessor;
import ek.jainput.proc.KatakanaKeyProcessor;
import ek.jainput.proc.KeyProcessor;


@SuppressWarnings("serial")
public class MainTextArea extends JPanel 
    implements KeyListener, KeyProcessor.Callback
{
    public static enum KbMode { Hiragana, Katakana, Kanji };
    
    public static interface Callback
    {
        public void onSetKbMode(KbMode mode);
        public void onShowReading(char kanji);
        public void onClearHelpLabel();
    }
    
    private JTextArea txtInput;
    
    private Callback callback;
    private HiraganaKeyProcessor hiraProc;
    private KatakanaKeyProcessor kataProc;
    private KanjiKeyProcessor kanjiProc;
    private KeyProcessor keyProc;
    
    
    public MainTextArea(UISettings cfg)
    {
        super(new BorderLayout());
        setBackground(cfg.labelBG);

        txtInput = new JTextArea();

        txtInput.setLineWrap(false);
        txtInput.setFont(cfg.textFont);

        txtInput.setCaretColor(Color.GRAY);
        txtInput.setBackground(cfg.textBG);
        txtInput.setForeground(cfg.textFG);
        
        txtInput.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK), "none");
        txtInput.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_K, KeyEvent.CTRL_DOWN_MASK), "none");
        txtInput.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_J, KeyEvent.CTRL_DOWN_MASK), "none");
        
        txtInput.getActionMap().put(DefaultEditorKit.deletePrevCharAction, new CustomTextActions.DeletePrevCharAction());
        txtInput.addKeyListener(this);
        txtInput.setBorder(new EmptyBorder(5, 5, 5, 5));
        txtInput.setAlignmentX(LEFT_ALIGNMENT);
        
        add(createScrollPane());

        hiraProc = new HiraganaKeyProcessor(this);
        kataProc = new KatakanaKeyProcessor(this);
        kanjiProc = new KanjiKeyProcessor(this);
        keyProc = hiraProc;
    }
    
    
    public void setCallback(Callback cb)
    {
        this.callback = cb;
    }
    
    
    private JScrollPane createScrollPane()
    {
        Color scrollBg = new Color(30, 30, 30);
        JScrollPane scrollPane = new JScrollPane(txtInput);
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        scrollPane.getVerticalScrollBar().setBackground(scrollBg);
        scrollPane.getHorizontalScrollBar().setBackground(scrollBg);

        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        scrollPane.getHorizontalScrollBar().setUI(new MyScrollBarUI());
        
        scrollPane.setBackground(Color.DARK_GRAY);

        return scrollPane;
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
                if(callback != null) callback.onSetKbMode(KbMode.Kanji);
                break;
            // Ctrl-H
            case 8:
                keyProc = hiraProc;
                if(callback != null) callback.onSetKbMode(KbMode.Hiragana);
                break;
            // Ctrl-K
            case 11:
                keyProc = kataProc;
                if(callback != null) callback.onSetKbMode(KbMode.Katakana);
                break;
            }
        }
        else
        {
            // Esc
            if(ch == 27)
            {
                callback.onClearHelpLabel();
                //key1 = 0;
            }
            else
            {
                keyProc.processKey(ch);
            }
        }
    }

    
    @Override
    public void keyPressed(KeyEvent e)
    {
    }

    
    @Override
    public void keyReleased(KeyEvent e)
    {
        //if(key1 != 0) return;
        
        if(e.getKeyCode() == KeyEvent.VK_F3) 
        {
            String txt = txtInput.getSelectedText();
            if(txt == null || txt.isEmpty())
            {
                txt = txtInput.getText();
            }            
            if(txt == null || txt.isEmpty()) return;
            
            if(txt.length() == 1)
            {
                showReading(txt.charAt(0));
            }
            else
            {
                showReading(txt.charAt(txt.length()-1));
            }
        }
        
    }
    
    
    @Override
    public void onText(String str)
    {
        txtInput.replaceSelection("");
        txtInput.insert(str, txtInput.getCaretPosition());
        /*
        try
        {
            txtInput.getDocument().insertString(txtInput.getCaretPosition(), str, null);
        }
        catch(Exception ex)
        {
        }
        */
    }

    
    private void showReading(char kanji)
    {
        if(callback != null)
        {
            callback.onShowReading(kanji);
        }
    }

    
}
