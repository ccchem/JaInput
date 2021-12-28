package ek.jainput.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultEditorKit;

import ek.jainput.proc.TextListener;
import ek.jainput.proc.kanji.HitoProc;
import ek.jainput.service.KanjiService;


@SuppressWarnings("serial")
public class KanjiTextField extends JPanel implements KeyListener
{
    private JTextField txtInput;
    private JLabel lblHelp1;
    private JLabel lblHelp2;
    
    private char key1 = 0;
    
    private char[] keyMap = new char[255];
    
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
        lblHelp1.setFont(cfg.labelFont);
        lblHelp1.setForeground(cfg.labelFG);
        lblHelp1.setBorder(new EmptyBorder(5, 5, 5, 5));

        lblHelp2 = new JLabel();
        lblHelp2.setFont(cfg.labelFont);
        lblHelp2.setForeground(cfg.labelFG);
        lblHelp2.setBorder(new EmptyBorder(0, 5, 5, 5));

        initKeyMap();

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
    }

    
    private void processFirstKey(char ch)
    {
        if(ch == '\n')
        {
            handleEnter();
        }
        else
        {
            switch(ch)
            {
            case HitoProc.KEY1:
                key1 = ch;
                lblHelp1.setText(HitoProc.helpText1);
                lblHelp2.setText(HitoProc.helpText2);
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
            
            switch(key1)
            {
            case HitoProc.KEY1:
                kanji = HitoProc.getKanji(ch);
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

    
    private void initKeyMap()
    {
        initKeyMap0();
        initKeyMap1();
        initKeyMap2();
        initKeyMap3();
    }

    
    // Row 0
    private void initKeyMap0()
    {
        keyMap['1'] = '人';
        keyMap['!'] = '火';
        
        keyMap['2'] = '厂';
        
        keyMap['3'] = '三';
        
        keyMap['4'] = '止';
        keyMap['$'] = '円';        
        
        keyMap['5'] = '力';
        keyMap['6'] = '五';
                
        keyMap['7'] = '七';
        keyMap['&'] = '子';        
        
        keyMap['8'] = '八';
        keyMap['*'] = '米';
        
        keyMap['9'] = '九';
        keyMap['0'] = '国';        
        
        keyMap['-'] = '一';
        
        keyMap['+'] = '十';
        keyMap['='] = '二';

    }
    
    // Row 1
    private void initKeyMap1()
    {
        keyMap['q'] = '手';

        //keyMap['w'] = '田';
        keyMap['W'] = '金';

        keyMap['e'] = '隹';
        keyMap['E'] = 'ヨ';
        
        keyMap['r'] = '口';
        keyMap['R'] = '刀';

        keyMap['t'] = '丁';
        keyMap['T'] = '立';
        
        keyMap['y'] = '卜';
        keyMap['Y'] = '山';

        keyMap['u'] = '言';

        keyMap['i'] = '糸';
        keyMap['I'] = '工';

        keyMap['o'] = '大';
        keyMap['O'] = '王';
        
        keyMap['p'] = '尸';
        
        keyMap['\\'] = '巾';
        keyMap['|'] = '中';
    }
    
    
    // Row 2
    private void initKeyMap2()
    {
        keyMap['a'] = '田';
        keyMap['A'] = '夕';


        keyMap['s'] = '弓';
        keyMap['S'] = '阝';
        
        //keyMap['d'] = '木';
        
        //keyMap['f'] = '火';

        keyMap['g'] = '月';
        keyMap['G'] = '几';

        keyMap['h'] = '竹';
        keyMap['H'] = '門';        

        keyMap['j'] = '寸';
        keyMap['J'] = '儿';

        keyMap['k'] = '木';

        keyMap['l'] = '心';
        keyMap['L'] = '小';
        
        keyMap['\''] = '戈';
        keyMap['"'] = '廿';
    }


    // Row 3
    private void initKeyMap3()
    {
        keyMap['x'] = 'メ';
        
        keyMap['c'] = '土';
        keyMap['C'] = '也';
        
        keyMap['v'] = '女';
        
        //keyMap['b'] = '月';
        //keyMap['B'] = '几';

        keyMap['n'] = '日';
        keyMap['N'] = '目';

        keyMap['m'] = '水';
        keyMap['M'] = '雨';
        
        keyMap['/'] = 'ノ';
    }
}
