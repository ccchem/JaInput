package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Y_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "卜 y  止 t  丬 1"
    };
    
    @Override
    public char getKey1() 
    {
        return 'y';
    }
    
    @Override
    public String[] getHelp() 
    {
        return helpText;
    }

    @Override
    public String getKanji(char ch)
    {
        switch(ch)
        {
        
        case 'y': return("卜");
        case 't': return("止");
        
        case '1': return("丬");        
        
        }
        
        return null;
    }
}
