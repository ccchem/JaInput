package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class S_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "門 k  臼 u  耳 m  弓 s"
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
        case 's': return("弓");

        case 'k': return("門");
        case 'u': return("臼");
        
        }
        
        return null;
    }
}
