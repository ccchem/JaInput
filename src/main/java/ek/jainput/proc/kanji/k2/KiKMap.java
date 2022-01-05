package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class KiKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "木 k  禾 2  本 -  未 m  末 s  来 u",
        "束 8  林 h  森 r  耒 3"
    };

    @Override
    public char getKey1() 
    {
        return 'k';
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
        case 'k': return("木");
        case '2': return("禾");
        case '3': return("耒");        
        case '-': return("本");

        case 'h': return("林");
        case 'r': return("森");        
        
        case 'm': return("未");
        case 's': return("末");
        
        case 'u': return("来");
        
        case '8': return("束");
        
        }
        
        return null;
    }
}
