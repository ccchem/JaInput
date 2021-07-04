package ek.jainput;

import javax.swing.SwingUtilities;


public class JaInputMain
{

    public static void main(String[] args)
    {
        // Enable text anti aliasing
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");
        
        SwingUtilities.invokeLater(() ->
        {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        });
    }

}
