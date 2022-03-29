package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class S_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "弓 y  弟 o  耳 m  最 s  臼 u"
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
        case 'y': return("弓");
        case 'o': return("弟");

        case 'm': return("耳");
        case 's': return("最");

        case 'u': return("臼");
        
        }
        
        return null;
    }
}
