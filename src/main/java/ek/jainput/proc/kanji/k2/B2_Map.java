package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class B2_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "同 o  周 m  高 t  咼 2  舟 f"
    };
    
    @Override
    public char getKey1() 
    {
        return 'B';
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
        case 'o': return("同");
        case 'm': return("周");
        case 't': return("高");
        case '2': return("咼");

        case 'f': return("舟");
        }
        
        return null;
    }
}
