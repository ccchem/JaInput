package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class HitoKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "人 h  亻 1  彳 2  入 u  行 x  火 k  以 i",
        "今 m  食 b  金 c  欠 a"
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
        case 'h': return("人");
        case 'u': return("入");
        case 'm': return("今");
        case 'b': return("食");
        case 'c': return("金");        
        
        case 'i': return("以");
        
        case '1': return("亻");
        case '2': return("彳");
        case 'x': return("行");

        case 'k': return("火");
        case 'a': return("欠");

        }
        
        return null;
    }
}
