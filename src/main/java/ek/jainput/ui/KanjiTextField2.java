package ek.jainput.ui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultEditorKit;

import ek.jainput.proc.TextListener;
import ek.jainput.service.KanjiService;


@SuppressWarnings("serial")
public class KanjiTextField2 extends JPanel implements KeyListener
{
    private JTextField txtInput;
        
    private char[] keyMap = new char[255];
    
    private TextListener textListener;
    
    public KanjiTextField2(UISettings cfg)
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
        
        add(txtInput);
        
        initKeyMap();
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
        
        processFirstKey(ch);
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
            char kanji = keyMap[ch];
            if(kanji != 0)
            {
                insertAtCursor("" + kanji);
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

    
    private void initKeyMap()
    {
        keyMap['`'] = '丶';
        keyMap['-'] = '一';
        
        keyMap['+'] = '十';
        keyMap['='] = '二';
        
        keyMap['/'] = 'ノ';        
        
        keyMap['1'] = '人';
        keyMap['!'] = '彳';
        
        keyMap['2'] = '勹';
        keyMap['@'] = '已';
        
        keyMap['3'] = '阝';
        keyMap['#'] = '井';

        keyMap['4'] = '厶';
        keyMap['$'] = '糸';
        
        keyMap['5'] = '五';
        
        keyMap['7'] = '七';
        keyMap['&'] = '衣';

        keyMap['8'] = '几';
        keyMap['*'] = '米';
        
        keyMap['9'] = '九';
        
        keyMap['0'] = '園';
                
        keyMap['\''] = '弋';
        keyMap['"'] = '廿';
        
        // --------------------------------------
        
        keyMap['a'] = '日';
        keyMap['A'] = '目';

        keyMap['b'] = '月';
        keyMap['B'] = '用';
        
        keyMap['c'] = '金';
        //keyMap['C'] = '子';
        //keyMap['C'] = '子';

        keyMap['d'] = '力';
        keyMap['D'] = '.';

        keyMap['e'] = 'ヨ';
        keyMap['E'] = '隹';

        keyMap['f'] = '中';
        keyMap['F'] = '巾';

        keyMap['g'] = '土';
        keyMap['G'] = '王';

        keyMap['h'] = '竹';
        keyMap['H'] = '門';

        keyMap['i'] = '.';
        keyMap['I'] = '工';

        keyMap['j'] = '小';
        keyMap['J'] = '寸';

        keyMap['k'] = '木';
        keyMap['K'] = '禾';

        keyMap['l'] = '心';
        keyMap['L'] = '儿';

        keyMap['m'] = '水';
        keyMap['M'] = '雨';

        keyMap['n'] = '.';
        keyMap['N'] = '.';

        keyMap['o'] = '大';
        keyMap['O'] = '夕';

        keyMap['p'] = '尸';
        keyMap['P'] = '卩';

        keyMap['q'] = '手';
        keyMap['Q'] = '.';

        keyMap['r'] = '口';
        keyMap['R'] = '刀';

        keyMap['s'] = '.';
        keyMap['S'] = '.';

        keyMap['t'] = '斤';
        keyMap['T'] = '丁';

        keyMap['u'] = '言';
        keyMap['U'] = '.';

        keyMap['v'] = '女';
        keyMap['V'] = '火';

        keyMap['w'] = '田';
        keyMap['W'] = '山';
        
        keyMap['x'] = '乂';
        keyMap['X'] = '丬';
        
        keyMap['y'] = '卜';
        keyMap['Y'] = '止';
        
        keyMap['z'] = '難';
        
    }
}
