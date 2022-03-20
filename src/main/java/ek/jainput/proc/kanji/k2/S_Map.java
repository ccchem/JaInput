package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class S_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "耳 m  最 s  色 i  臼 u"
    };
    
    @Override
    public char getKey1() 
    {
        return 's';
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
        case 'm': return("耳");
        case 's': return("最");

        case 'i': return("色");

        case 'u': return("臼");
        
        }
        
        return null;
    }
}
