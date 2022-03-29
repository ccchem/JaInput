package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class G_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "土 t  干 h  半 1  平 2"
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
        case 't': return("土");
        case 'h': return("干");
        
        case '1': return("半");
        case '2': return("平");
        
        }
        
        return null;
    }
}
