package ek.jainput.kanji;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class KanjiService
{
    private static KanjiService instance;
    
    private Map<String, String> map;
    
    private KanjiService() throws Exception
    {
        map = new HashMap<>(500);
        loadFile("g1.txt");
    }

    
    public static KanjiService getInstance()
    {
        return instance;
    }
    
    
    public static void init() throws Exception
    {
        instance = new KanjiService();
    }
    
    public String search(String str)
    {
        return map.get(str);
    }

    
    private void loadFile(String name) throws Exception
    {
        InputStream is = null;
        
        try
        {
            is = this.getClass().getClassLoader().getResourceAsStream(name);
            if(is == null) throw new Exception("Could not open file " + name);
            
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            
            String line;
            while((line = rd.readLine()) != null)
            {
                if(line.length() == 0 || line.startsWith("#")) continue;
                
                String kanji = line.substring(0, 1);
                String key = line.substring(3);
                map.put(key, kanji);
            }
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
