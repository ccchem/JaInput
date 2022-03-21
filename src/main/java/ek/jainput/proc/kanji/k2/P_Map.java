package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class P_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "高 t  咼 2  "
    };
    
    @Override
    public char getKey1() 
    {
        return 'p';
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
        case 'h': return("方");
        
        case 't': return("高");
        case '2': return("咼");

        }
        
        return null;
    }
}
