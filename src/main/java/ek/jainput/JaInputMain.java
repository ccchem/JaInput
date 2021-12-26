package ek.jainput;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import ek.jainput.service.KanjiService;
import ek.jainput.ui.MainWindow;


public class JaInputMain
{

    public static void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        // Enable text anti aliasing
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");
        
        KanjiService.init();
        
        SwingUtilities.invokeLater(() ->
        {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        });
    }

}
