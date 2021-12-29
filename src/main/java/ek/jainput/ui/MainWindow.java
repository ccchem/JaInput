package ek.jainput.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class MainWindow extends JFrame implements MainTextArea.KbModeListener
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
        //canTxt.setBorder(new CompoundBorder(new LineBorder(Color.GRAY), new EmptyBorder(10, 5, 10, 5)));

        textArea = new MainTextArea(cfg);
        textArea.setKbModeListener(this);
        textArea.setBorder(new EmptyBorder(10, 5, 10, 5));
        
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
        
        //getContentPane().setBackground(Colors.panelBg);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.getVerticalScrollBar().setBackground(Color.BLACK);
        scrollPane.getHorizontalScrollBar().setBackground(Color.BLACK);

        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(canTxt, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(kbType, BorderLayout.SOUTH);
        
        getContentPane().add(mainPanel);

        setSize(600, 400);
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
    
}
