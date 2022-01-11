package ek.jainput.ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ek.jainput.service.KanjiService;
import ek.jainput.ui.MainTextArea.KbMode;


@SuppressWarnings("serial")
public class MainWindow extends JFrame
{
    private KanjiTextField canTxt;
    private MainTextArea textArea;
    
    private JLabel kbType;
    
    
    public MainWindow(UISettings cfg)
    {
        super("JaInput");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initUI(cfg);
    }

    
    private void initUI(UISettings cfg)
    {
        canTxt = new KanjiTextField(cfg);
        textArea = new MainTextArea(cfg);
        textArea.setCallback(new MainTextArea.Callback()
        {
            @Override
            public void onSetKbMode(KbMode mode)
            {
                switch(mode)
                {
                case Kanji: 
                    kbType.setText("漢字"); 
                    break;
                case Hiragana: 
                    kbType.setText("あ"); 
                    break;
                case Katakana: 
                    kbType.setText("カ"); 
                    break;
                }
            }

            @Override
            public void onShowReading(char kanji)
            {
                KanjiService srv = KanjiService.getInstance();
                
                String kunR = srv.getKunReading(kanji);
                if(kunR != null)
                {
                    canTxt.setHelp1(kunR);
                }

                String onR = srv.getOnReading(kanji);
                if(onR != null)
                {
                    canTxt.setHelp2(onR);
                }

            }

            @Override
            public void onClearHelpLabel()
            {
                canTxt.clearHelp();
            }
    
        });
        
        canTxt.setTextListener((txt) -> { textArea.onText(txt); });
        
        /*
        addWindowListener(new WindowAdapter()
        {
            public void windowOpened(WindowEvent e)
            {
                textArea.requestFocus();
            }
        });
        */
        
        kbType = new JLabel("あ");
        kbType.setFont(cfg.labelFont);
        kbType.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        kbType.setForeground(cfg.labelFG);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(canTxt, BorderLayout.NORTH);
        mainPanel.add(textArea, BorderLayout.CENTER);
        mainPanel.add(kbType, BorderLayout.SOUTH);
        
        getContentPane().add(mainPanel);
    }

    
}
