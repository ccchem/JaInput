package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class TakeKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "竹 2  乍 3  年 n  午 g  牛 u",
        "夕 y  隹 z"
    };

    @Override
    public char getKey1() 
    {
        return 'h';
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
        case 'n': return("年");
        case 'g': return("午");
        case 'u': return("牛");
        
        case '2': return("竹");
        case '3': return("乍");

        case 'y': return("夕");
        
        case 'z': return("隹");
        }
        
        return null;
    }
}
