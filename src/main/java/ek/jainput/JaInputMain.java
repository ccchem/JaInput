package ek.jainput;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import ek.jainput.kanji.KanjiService;


public class JaInputMain
{

    public static void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        // Enable text anti aliasing
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");
        
        KanjiService kanjiSrv = new KanjiService();
        
        SwingUtilities.invokeLater(() ->
        {
            MainWindow window = new MainWindow(kanjiSrv);
            window.setVisible(true);
        });
    }

}
