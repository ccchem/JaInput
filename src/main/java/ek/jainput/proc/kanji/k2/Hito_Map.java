package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Hito_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "入 i  久 h  欠 k  及 o"
    };

    @Override
    public char getKey1() 
    {
        return '1';
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
        case 'i': return("入");
        case 'h': return("久");
        case 'k': return("欠");
        case 'o': return("及");

        }
        
        return null;
    }
}
