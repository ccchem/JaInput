package ek.jainput.kanji;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class KanjiService
{
    private Map<String, String> map;
    
    public KanjiService() throws Exception
    {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("kanji.dat");
        if(is == null) throw new Exception("Could not open kanji data file.");
        
        try
        {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            
            map = new HashMap<>(500);
            
            String line;
            while((line = rd.readLine()) != null)
            {
                String tokens[] = line.split("\\|");
                if(tokens.length == 2)
                {
                    map.put(tokens[1], tokens[0]);
                }
            }
        }
        finally
        {
            is.close();
        }
    }

    
    public String search(String kana)
    {
        return map.get(kana);
    }
}
