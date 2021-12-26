package ek.jainput.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;
import javax.swing.text.DefaultEditorKit;

import ek.jainput.proc.TextListener;
import ek.jainput.service.KanjiService;


@SuppressWarnings("serial")
public class CangjieTextField extends JTextField implements KeyListener
{
    private char[] keyMap = new char[255];
    
    private TextListener textListener;
    
    public CangjieTextField(Font font)
    {
        initKeyMap();
        
        setFont(font);
        setBackground(Colors.textBG);
        setForeground(Colors.textFG);
        setCaretColor(Color.GRAY);
        
        addKeyListener(this);
        
        getActionMap().put(DefaultEditorKit.deletePrevCharAction, new CustomTextActions.DeletePrevCharAction());
    }

    
    public void setTextListener(TextListener listener)
    {
        this.textListener = listener;
    }
    
    
    @Override
    public void keyTyped(KeyEvent e)
    {
        char ch = e.getKeyChar();
        e.consume();
        
        if(ch == '\n')
        {
            handleEnter();
        }
        else
        {
            char kanji = keyMap[(short)ch];
            if(kanji != 0)
            {
                insertAtCursor("" + kanji);
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
    }
    
    
    private void handleEnter()
    {
        String txt = getText();
        if(!txt.isEmpty())
        {
            String kanji = KanjiService.getInstance().search(txt);
            System.out.println(kanji);

            if(kanji != null)
            {
                setText("");
                if(textListener != null) 
                {
                    textListener.onText(kanji);
                }
            }
        }
    }
    
    private void insertAtCursor(String str)
    {
        replaceSelection("");
        try
        {
            getDocument().insertString(getCaretPosition(), str, null);
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
        keyMap['-'] = '一';        
        keyMap['+'] = '十';
        keyMap['|'] = '中';
        
        keyMap['1'] = '人';
        keyMap['!'] = '入';
    
        keyMap['2'] = '冫';
        keyMap['@'] = '厂';
        
        keyMap['3'] = '三';
        keyMap['4'] = '止';
        
        keyMap['8'] = '八';
        keyMap['9'] = '九';
    }
    
    // Row 1
    private void initKeyMap1()
    {
        keyMap['q'] = '手';

        keyMap['w'] = '田';
        keyMap['W'] = '夕';

        keyMap['e'] = 'ヨ';
        
        keyMap['r'] = '口';
        keyMap['R'] = '刀';

        keyMap['t'] = '丁';
        keyMap['T'] = '立';        
        
        keyMap['y'] = '卜';
        keyMap['Y'] = '山';

        keyMap['u'] = '言';

        keyMap['i'] = '糸';
        keyMap['I'] = '工';
        
        keyMap['o'] = '王';

        keyMap['p'] = '尸';
    }
    
    
    // Row 2
    private void initKeyMap2()
    {
        keyMap['a'] = '日';
        keyMap['A'] = '目';

        keyMap['s'] = '弓';
        keyMap['S'] = '阝';
        
        //keyMap['d'] = '木';
        
        keyMap['f'] = '火';
        
        keyMap['g'] = '土';
        
        keyMap['h'] = '竹';
        keyMap['H'] = '門';        

        keyMap['j'] = '寸';
        keyMap['J'] = '儿';

        keyMap['k'] = '木';
        keyMap['K'] = '大';
        
        keyMap['l'] = '心';
        keyMap['L'] = '小';
        
        keyMap['\''] = '戈';
        keyMap['"'] = '廿';
    }


    // Row 3
    private void initKeyMap3()
    {
        keyMap['c'] = '子';
        keyMap['C'] = '金';
    
        keyMap['v'] = '女';
        
        keyMap['b'] = '月';
        keyMap['B'] = '几';
        
        keyMap['m'] = '水';
        keyMap['M'] = '雨';        
    }
}
