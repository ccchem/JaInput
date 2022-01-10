package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class G_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "干 2  平 b  半 n  生 s  羊 h"
    };

    @Override
    public char getKey1() 
    {
        return 'g';
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
        case '2': return("干");

        case 'b': return("平");
        case 'n': return("半");        
        case 's': return("生");
        case 'h': return("羊");
        
        }
        
        return null;
    }
}
