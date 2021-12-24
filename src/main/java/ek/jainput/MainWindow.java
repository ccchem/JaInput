package ek.jainput;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import ek.jainput.kanji.KanjiService;
import ek.jainput.proc.HiraganaKeyProcessor;


@SuppressWarnings("serial")
public class MainWindow extends JFrame implements MainTextArea.KbModeListener
{
    private CangjieTextField canTxt;
    private MainTextArea textArea;
    private HiraganaKeyProcessor proc;
    
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
        canTxt.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));

        textArea = new MainTextArea(txtFont);
        textArea.setKbModeListener(this);
        
        addWindowListener(new WindowAdapter()
        {
            public void windowOpened(WindowEvent e)
            {
                textArea.requestFocus();
            }
        });
        
        kbType = new JLabel("あ");
        kbType.setFont(lblFont);
        kbType.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        
        getContentPane().add(canTxt, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);
        getContentPane().add(kbType, BorderLayout.SOUTH);
        pack();
        
        // Center on screen
        setLocationRelativeTo(null);
    }

    
    public void onSetKbMode(MainTextArea.KbMode mode)
    {
        switch(mode)
        {
        case Kanji: kbType.setText("漢字"); break;
        case Hiragana: kbType.setText("あ"); break;
        case Katakana: kbType.setText("カ"); break;
        }
    }
    
    
    private void onKanji()
    {
        String txt = textArea.getSelectedText();
        if(txt == null) txt = textArea.getText();
        if(txt == null || txt.isEmpty()) return;
        
        String kanji = kanjiSrv.search(txt);
        if(kanji != null)
        {
            //insertAtCursor(kanji);
        }
    }
}
