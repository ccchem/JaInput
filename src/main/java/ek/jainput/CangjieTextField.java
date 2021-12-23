package ek.jainput;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class CangjieTextField extends JTextField implements KeyListener
{
    public CangjieTextField(Font font)
    {
        this.setFont(font);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        char ch = e.getKeyChar();
        e.consume();
        
        switch(ch)
        {
        case 'a': insertAtCursor("日"); break;
        case 'b': insertAtCursor("月"); break;
        case 'c': insertAtCursor("金"); break;
        case 'd': insertAtCursor("木"); break;
        case 'e': insertAtCursor("水"); break;
        case 'f': insertAtCursor("火"); break;
        case 'g': insertAtCursor("土"); break;
        
        case 'h': insertAtCursor("竹"); break;
        case 'i': insertAtCursor("戈"); break;
        case 'j': insertAtCursor("十"); break;
        case 'k': insertAtCursor("大"); break;
        case 'l': insertAtCursor("中"); break;
        case '-': insertAtCursor("一"); break;
        case 'n': insertAtCursor("弓"); break;
        
        case 'o': insertAtCursor("人"); break;
        case 'p': insertAtCursor("心"); break;
        case 'q': insertAtCursor("手"); break;
        case 'r': insertAtCursor("口"); break;
        case 's': insertAtCursor("尸"); break;
        case 't': insertAtCursor("廿"); break;
        case 'u': insertAtCursor("山"); break;
        case 'v': insertAtCursor("女"); break;
        case 'w': insertAtCursor("田"); break;
        case 'y': insertAtCursor("卜"); break;

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

}
