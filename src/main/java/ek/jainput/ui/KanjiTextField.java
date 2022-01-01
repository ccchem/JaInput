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
import ek.jainput.proc.kanji.KiProc;
import ek.jainput.proc.kanji.N4Proc;
import ek.jainput.proc.kanji.NakaProc;
import ek.jainput.proc.kanji.NichiProc;
import ek.jainput.proc.kanji.OokiProc;
import ek.jainput.proc.kanji.TakeProc;
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

    
    private void initKey1Map()
    {
        KanjiProc kp;
        
        // 人
        addKey1Map(new HitoProc());
        // 金
        addKey1Map(new KaneProc());
        // 日
        addKey1Map(new NichiProc());
        // 大
        addKey1Map(new OokiProc());
        // 木
        addKey1Map(new KiProc());
        // 竹
        addKey1Map(new TakeProc());
        // 中
        addKey1Map(new NakaProc());
        // 厶
        addKey1Map(new N4Proc());
    }
    
    
    private void addKey1Map(KanjiProc kp)
    {
        key1Map[kp.getKey1()] = kp;
    }
}
