package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class F_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "虫 m  史 s  夬 w"
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
        case 'm': return("虫");        
        case 'w': return("夬");

        case 's': return("史");
        
        }
        
        return null;
    }
}
