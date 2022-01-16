package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class S_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "色 i  門 k  臼 u  耳 m"
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
        case 'i': return("色");
        case 'm': return("耳");

        case 'k': return("門");
        case 'u': return("臼");
        
        }
        
        return null;
    }
}
