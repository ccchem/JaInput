package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class H_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "竹 h  午 g  牛 u"
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
        case 'g': return("午");
        case 'u': return("牛");
        
        case 'h': return("竹");
        }
        
        return null;
    }
}
