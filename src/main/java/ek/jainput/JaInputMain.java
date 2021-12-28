package ek.jainput;

import java.awt.Font;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import ek.jainput.service.KanjiService;
import ek.jainput.ui.MainWindow;
import ek.jainput.ui.UISettings;


public class JaInputMain
{

    public static void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        // Enable text anti aliasing
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");
        
        KanjiService.init();
        
        UISettings cfg = new UISettings();
        cfg.textFont = new Font("MS Gothic", Font.PLAIN, 36);
        cfg.labelFont = new Font("MS Gothic", Font.PLAIN, 18);
        
        SwingUtilities.invokeLater(() ->
        {
            MainWindow window = new MainWindow(cfg);
            window.setVisible(true);
        });
    }

}
