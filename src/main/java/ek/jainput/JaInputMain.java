package ek.jainput;

import java.awt.Font;
import java.io.InputStream;
import javax.swing.SwingUtilities;
import ek.jainput.service.KanjiService;
import ek.jainput.ui.MainWindow;
import ek.jainput.ui.UISettings;


public class JaInputMain
{

    public static void main(String[] args) throws Exception
    {
        // Enable text anti aliasing
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");
        
        KanjiService.init();
        
        Font[] fonts = loadFont("TakaoGothic.ttf");
        
        UISettings cfg = new UISettings();
        //cfg.textFont = new Font("MS Gothic", Font.PLAIN, 36);
        
        cfg.textFont = fonts[0].deriveFont(40.0f);
        cfg.helpFont = fonts[0].deriveFont(30.0f);
        cfg.labelFont = fonts[0].deriveFont(24.0f);
        
        SwingUtilities.invokeLater(() ->
        {
            MainWindow window = new MainWindow(cfg);
            window.setSize(800, 500);
            // Center on screen
            window.setLocationRelativeTo(null);
            window.setVisible(true);
        });
    }

    
    private static Font[] loadFont(String name) throws Exception
    {
        InputStream is = null;
        
        try
        {
            is = JaInputMain.class.getClassLoader().getResourceAsStream(name);
            if(is == null) throw new Exception("Could not open file " + name);
            
            Font[] fonts = Font.createFonts(is);
            if(fonts == null || fonts.length == 0) throw new Exception("Could not create font " + name);

            return fonts;
        }
        finally
        {
            if(is != null)
            {
                is.close();
            }
        }
    }

}
