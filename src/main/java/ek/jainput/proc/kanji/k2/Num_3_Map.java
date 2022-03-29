package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Num_3_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "阝 3  乃 1  及 o",
    };

    @Override
    public char getKey1() 
    {
        return '3';
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
        case '3': return("阝");
        case '1': return("乃");
        case 'o': return("及");
        
        }
        
        return null;
    }
}
