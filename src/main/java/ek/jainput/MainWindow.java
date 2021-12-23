package ek.jainput;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ek.jainput.kanji.KanjiService;


@SuppressWarnings("serial")
public class MainWindow extends JFrame implements KeyListener
{
    private CangjieTextField canTxt;
    private MainTextArea textArea;
    private KeyProcessor proc;
    
    private KanjiService kanjiSrv;
    
    private JLabel kbType;
    
    
    public MainWindow(KanjiService kanjiSrv)
    {
        super("JaInput");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.kanjiSrv = kanjiSrv;
        
        initUI();
    }

    
    private void initUI()
    {
        Font txtFont = new Font("MS Gothic", Font.PLAIN, 36);
        Font lblFont = new Font("MS Gothic", Font.PLAIN, 18);
        
        canTxt = new CangjieTextField(txtFont);        
        textArea = new MainTextArea(txtFont);

        kbType = new JLabel("ひらがな");
        kbType.setFont(lblFont);
        
        textArea.addKeyListener(this);
        proc = new KeyProcessor((str) -> { insertAtCursor(str); });
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        mainPanel.add(canTxt);
        mainPanel.add(new JScrollPane(textArea));
        
        getContentPane().add(mainPanel);
        getContentPane().add(kbType, BorderLayout.PAGE_END);
        pack();
        
        // Center on screen
        setLocationRelativeTo(null);
    }

    
    @Override
    public void keyTyped(KeyEvent e)
    {
        char ch = e.getKeyChar();

        if(ch == 11) 
        {
            onKanji();
        }
        else
        {
            proc.processChar(ch);
        }

        e.consume();
    }

    
    private void onKanji()
    {
        String txt = textArea.getSelectedText();
        if(txt == null) txt = textArea.getText();
        if(txt == null || txt.isEmpty()) return;
        
        String kanji = kanjiSrv.search(txt);
        if(kanji != null)
        {
            insertAtCursor(kanji);
        }
    }
    
    private void insertAtCursor(String str)
    {
        textArea.replaceSelection("");
        textArea.insert(str, textArea.getCaretPosition());
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
