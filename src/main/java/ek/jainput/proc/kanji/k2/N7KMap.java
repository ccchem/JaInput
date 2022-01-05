package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class N7KMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "匕 t  七 7  衣 i  示 s"
    };

    @Override
    public char getKey1() 
    {
        return '7';
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
        case '7': return("七");
        case 't': return("匕");
        case 'i': return("衣");
        case 's': return("示");
        }
        
        return null;
    }
}
