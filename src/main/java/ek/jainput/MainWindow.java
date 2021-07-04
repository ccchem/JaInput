package ek.jainput;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MainWindow extends JFrame implements KeyListener
{
    private JTextArea textArea;
    private KeyProcessor proc;
    
    
    public MainWindow()
    {
        super("JaInput");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initUI();
    }
    
    private void initUI()
    {
        textArea = new JTextArea();
        textArea.setColumns(50);
        textArea.setRows(5);
        textArea.setLineWrap(true);
        
        Font font = new Font("MS Gothic", Font.PLAIN, 36);
        textArea.setFont(font);

        textArea.addKeyListener(this);
        proc = new KeyProcessor((str) -> { insertAtCursor(str); });
        
        getContentPane().add(textArea);
        pack();
        
        // Center on screen
        setLocationRelativeTo(null);
    }

    
    @Override
    public void keyTyped(KeyEvent e)
    {
        char ch = e.getKeyChar();
        e.consume();
        proc.processChar(ch);
    }

    
    private void insertAtCursor(String str)
    {
        textArea.append(str);
    }

    
    @Override
    public void keyPressed(KeyEvent e)
    {
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }
}
