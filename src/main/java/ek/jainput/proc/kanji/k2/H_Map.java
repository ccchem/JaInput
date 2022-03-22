package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class H_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "牛 u  先 s  午 g  乍 n  竹 t"
    };

    @Override
    public char getKey1() 
    {
        return 'h';
    }
    
    public String[] getHelp() 
    { 
        return helpText; 
    }
    
    @Override
    public String getKanji(char ch)
    {
        switch(ch)
        {
        case 'u': return("牛");
        case 's': return("先");        
        
        case 'g': return("午");
        
        case 'n': return("乍");
        
        case 't': return("竹");        
        
        }
        
        return null;
    }
}
