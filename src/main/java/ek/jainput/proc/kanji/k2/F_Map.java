package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class F_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "中 n  央 o  夬 w"
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
        case 'n': return("中");
        case 'o': return("央");        
        case 'w': return("夬");

        
        }
        
        return null;
    }
}
