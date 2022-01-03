package ek.jainput.ui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultEditorKit;

import ek.jainput.proc.TextListener;
import ek.jainput.proc.kanji.SecondKeyMap;
import ek.jainput.proc.kanji.SingleKeyMap;
import ek.jainput.proc.kanji.TwoKeyMap;
import ek.jainput.service.KanjiService;


@SuppressWarnings("serial")
public class KanjiTextField extends JPanel implements KeyListener
{
    private JTextField txtInput;
    private JLabel lblHelp1;
    private JLabel lblHelp2;
    
    private char key1 = 0;
    
    private SingleKeyMap sKeyMap = new SingleKeyMap();
    private TwoKeyMap twoKeyMap = new TwoKeyMap();
    
    private TextListener textListener;
    
    public KanjiTextField(UISettings cfg)
    {
        super();
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBackground(cfg.labelBG);

        txtInput = new JTextField();
        txtInput.setCaretColor(Color.GRAY);
        txtInput.addKeyListener(this);
        txtInput.getActionMap().put(DefaultEditorKit.deletePrevCharAction, new CustomTextActions.DeletePrevCharAction());
        txtInput.setFont(cfg.textFont);
        txtInput.setBackground(cfg.textBG);
        txtInput.setForeground(cfg.textFG);
        txtInput.setBorder(new CompoundBorder(txtInput.getBorder(), new EmptyBorder(10, 5, 10, 5)));
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
    }

    
    public void setTextListener(TextListener listener)
    {
        this.textListener = listener;
    }
    
    
    @Override
    public void keyTyped(KeyEvent e)
    {
        char ch = e.getKeyChar();
        //System.out.println((int)ch);
        
        e.consume();
        
        if(key1 != 0)
        {
            processSecondKey(ch);
        }
        else
        {
            processFirstKey(ch);
        }
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        if(key1 != 0) return;
        
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
    
    private void processFirstKey(char ch)
    {
        if(ch == '\n')
        {
            handleEnter();
        }
        // Esc
        else if(ch == 27)
        {
            clearHelpLabel();
        }
        else
        {
            SecondKeyMap kp = twoKeyMap.get(ch);
            if(kp != null)
            {
                key1 = ch;
                String[] help = kp.getHelp();
                if(help.length >= 1) lblHelp1.setText(help[0]);
                if(help.length >= 2) lblHelp2.setText(kp.getHelp()[1]);
            }
            else
            {
                char kanji = sKeyMap.get(ch);
                if(kanji != 0)
                {
                    insertAtCursor("" + kanji);
                }
            }
        }
    }

    
    private void clearHelpLabel()
    {
        lblHelp1.setText("");
        lblHelp2.setText("");
    }
    
    private void processSecondKey(char ch)
    {
        // Esc
        if(ch == 27)
        {
            clearHelpLabel();
            key1 = 0;
        }
        else
        {
            String kanji = null;
            SecondKeyMap kp = twoKeyMap.get(key1);
            if(kp != null)
            {
                kanji = kp.getKanji(ch);
            }
            
            if(kanji != null)
            {
                insertAtCursor(kanji);
                key1 = 0;
                clearHelpLabel();
            }
        }
    }
    
    
    private void handleEnter()
    {
        String txt = txtInput.getText();
        if(!txt.isEmpty())
        {
            String kanji = KanjiService.getInstance().findKanjiByParts(txt);
            System.out.println(kanji);

            if(kanji != null)
            {
                txtInput.setText("");
                if(textListener != null) 
                {
                    textListener.onText(kanji);
                }
            }
        }
    }
    
    private void insertAtCursor(String str)
    {
        txtInput.replaceSelection("");
        try
        {
            txtInput.getDocument().insertString(txtInput.getCaretPosition(), str, null);
        }
        catch(Exception ex)
        {
        }
    }
    
}
