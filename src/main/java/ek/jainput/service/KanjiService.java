package ek.jainput.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class KanjiService
{
    private static KanjiService instance;
    
    // key = parts, value = kanji
    private Map<String, String> partsMap;
    private Map<Character, String> onReading;
    private Map<Character, String> kunReading;
    
    /**
     * Private constructor. Use getInstance() instead.
     * @throws Exception
     */
    private KanjiService() throws Exception
    {
        partsMap = new HashMap<>(2500);
        loadPartsFile(partsMap, "primary.txt");
        loadPartsFile(partsMap, "secondary.txt");
        
        onReading = new HashMap<>(2500);
        loadReadingFile(onReading, "on-1-8.txt");

        kunReading = new HashMap<>(2500);
        loadReadingFile(kunReading, "kun-1-8.txt");
    }

    
    /**
     * Get singleton instance
     * @return the singleton
     */
    public static KanjiService getInstance()
    {
        return instance;
    }
    
    
    public static void init() throws Exception
    {
        instance = new KanjiService();
    }
    
    
    public String findKanjiByParts(String str)
    {
        return partsMap.get(str);
    }


    public String getOnReading(char ch)
    {
        return onReading.get(ch);
    }


    public String getKunReading(char ch)
    {
        return kunReading.get(ch);
    }

    
    private static void loadPartsFile(Map<String, String> map, String name) throws Exception
    {
        InputStream is = null;
        
        try
        {
            is = KanjiService.class.getClassLoader().getResourceAsStream(name);
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
    

    private static void loadReadingFile(Map<Character, String> map, String name) throws Exception
    {
        InputStream is = null;
        
        try
        {
            is = KanjiService.class.getClassLoader().getResourceAsStream(name);
            if(is == null) throw new Exception("Could not open file " + name);
            
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            
            String line;
            while((line = rd.readLine()) != null)
            {
                if(line.length() == 0 || line.startsWith("#")) continue;
                
                String kanji = line.substring(0, 1);
                String reading = line.substring(3);
                map.put(kanji.charAt(0), reading);
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
