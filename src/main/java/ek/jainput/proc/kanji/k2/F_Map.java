package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class F_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "中 f  虫 m  夬 w"
    };

    @Override
    public char getKey1() 
    {
        return 'f';
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
        case 'f': return("中");
        case 'm': return("虫");        
        case 'w': return("夬");

        
        }
        
        return null;
    }
}
