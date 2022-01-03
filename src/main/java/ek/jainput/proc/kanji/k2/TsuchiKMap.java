package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class TsuchiKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "工 1  干 2  王 3  平 b  半 n  生 s  羊 h",
        "土 g  地 c  聿 6"
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
        case '1': return("工");
        case '2': return("干");
        case '3': return("王");
        case '6': return("聿");

        case 'b': return("平");
        case 'n': return("半");        
        case 's': return("生");
        case 'h': return("羊");
        
        case 'g': return("土");
        case 'c': return("地");
        
        }
        
        return null;
    }
}
