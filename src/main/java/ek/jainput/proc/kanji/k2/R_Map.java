package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class R_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "石 i  呂 2  豆 m  舌 s"
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
        case 'i': return("石");        
        case '2': return("呂");
        
        case 'm': return("豆");
        case 's': return("舌");

        }
        
        return null;
    }
}
