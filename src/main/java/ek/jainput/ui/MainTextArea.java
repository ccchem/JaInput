package ek.jainput.ui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultEditorKit;

import ek.jainput.proc.HiraganaKeyProcessor;
import ek.jainput.proc.KanjiKeyProcessor;
import ek.jainput.proc.KeyProcessor;
import ek.jainput.service.KanjiService;


@SuppressWarnings("serial")
public class MainTextArea extends JPanel 
    implements KeyListener, KeyProcessor.Callback
{
    public static enum KbMode { Hiragana, Katakana, Kanji };
    
    public static interface KbModeListener
    {
        public void onSetKbMode(KbMode mode);
    }
    
    private JTextArea txtInput;
    private JLabel lblHelp1;
    private JLabel lblHelp2;
    
    private KbModeListener kbModeListener;
    private HiraganaKeyProcessor hiraProc;
    private KanjiKeyProcessor kanjiProc;
    private KeyProcessor keyProc;
    
    
    public MainTextArea(UISettings cfg)
    {
        super();
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBackground(cfg.labelBG);

        txtInput = new JTextArea();

        txtInput.setColumns(30);
        txtInput.setRows(3);
        txtInput.setLineWrap(true);
        txtInput.setFont(cfg.textFont);

        txtInput.setCaretColor(Color.GRAY);
        txtInput.setBackground(cfg.textBG);
        txtInput.setForeground(cfg.textFG);
        
        txtInput.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK), "none");
        txtInput.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_K, KeyEvent.CTRL_DOWN_MASK), "none");
        txtInput.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_J, KeyEvent.CTRL_DOWN_MASK), "none");
        
        txtInput.getActionMap().put(DefaultEditorKit.deletePrevCharAction, new CustomTextActions.DeletePrevCharAction());
        txtInput.addKeyListener(this);

        txtInput.setAlignmentX(LEFT_ALIGNMENT);
        
        lblHelp1 = new JLabel();
        lblHelp1.setFont(cfg.helpFont);
        lblHelp1.setForeground(cfg.labelFG);
        lblHelp1.setBorder(new EmptyBorder(5, 5, 5, 5));
        lblHelp1.setAlignmentX(LEFT_ALIGNMENT);

        lblHelp2 = new JLabel();
        lblHelp2.setFont(cfg.helpFont);
        lblHelp2.setForeground(cfg.labelFG);
        lblHelp2.setBorder(new EmptyBorder(0, 5, 5, 5));
        lblHelp2.setAlignmentX(LEFT_ALIGNMENT);

        add(txtInput);
        add(lblHelp1);
        add(lblHelp2);

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
            // Esc
            if(ch == 27)
            {
                clearHelpLabel();
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
        System.out.println(kanji);
        KanjiService srv = KanjiService.getInstance();
        
        String kunR = srv.getKunReading(kanji);
        if(kunR != null)
        {
            lblHelp1.setText(kunR);
        }

        String onR = srv.getOnReading(kanji);
        if(onR != null)
        {
            lblHelp2.setText(onR);
        }
    }

    
    private void clearHelpLabel()
    {
        lblHelp1.setText("");
        lblHelp2.setText("");
    }

}
