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
import ek.jainput.proc.kanji.HitoProc;
import ek.jainput.proc.kanji.KaneProc;
import ek.jainput.proc.kanji.KanjiProc;
import ek.jainput.proc.kanji.NichiProc;
import ek.jainput.proc.kanji.OokiProc;
import ek.jainput.service.KanjiService;


@SuppressWarnings("serial")
public class KanjiTextField extends JPanel implements KeyListener
{
    private JTextField txtInput;
    private JLabel lblHelp1;
    private JLabel lblHelp2;
    
    private char key1 = 0;
    
    private KanjiProc[] key1Map = new KanjiProc[255];
    
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
        
        lblHelp1 = new JLabel();
        lblHelp1.setFont(cfg.helpFont);
        lblHelp1.setForeground(cfg.labelFG);
        lblHelp1.setBorder(new EmptyBorder(5, 5, 5, 5));

        lblHelp2 = new JLabel();
        lblHelp2.setFont(cfg.helpFont);
        lblHelp2.setForeground(cfg.labelFG);
        lblHelp2.setBorder(new EmptyBorder(0, 5, 5, 5));

        add(txtInput);
        add(lblHelp1);
        add(lblHelp2);
        
        initKey1Map();
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
    }

    
    private void processFirstKey(char ch)
    {
        if(ch == '\n')
        {
            handleEnter();
        }
        else
        {
            KanjiProc kp = key1Map[ch];
            if(kp != null)
            {
                key1 = ch;
                lblHelp1.setText(kp.getHelp()[0]);
                lblHelp2.setText(kp.getHelp()[1]);
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
            KanjiProc kp = key1Map[key1];
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
            String kanji = KanjiService.getInstance().search(txt);
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

    
    private void initKey1Map()
    {
        KanjiProc kp;
        
        // 人
        kp = new HitoProc();
        key1Map[kp.getKey1()] = kp;
        
        // 金
        kp = new KaneProc();
        key1Map[kp.getKey1()] = kp;
        
        // 日
        kp = new NichiProc();
        key1Map[kp.getKey1()] = kp;
        
        // 大
        kp = new OokiProc();
        key1Map[kp.getKey1()] = kp;
        

    }
    
}
