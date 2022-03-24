package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Q2_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "可 m  司 s"
    };
    
    @Override
    public char getKey1() 
    {
        return 'Q';
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
        case 'm': return("可");
        case 's': return("司");
        
        }
        
        return null;
    }
}
