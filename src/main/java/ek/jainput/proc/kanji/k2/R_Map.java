package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class R_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "刀 k  力 c  方 h  豆 m  舌 s"
    };
    
    @Override
    public char getKey1() 
    {
        return 'r';
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
        case 'k': return("刀");
        case 'c': return("力");
        case 'h': return("方");

        case 'm': return("豆");
        case 's': return("舌");

        }
        
        return null;
    }
}
