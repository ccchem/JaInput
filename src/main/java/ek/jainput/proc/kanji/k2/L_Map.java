package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class L_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "心 k  色 i  也 c  乙 1  毛 2  兄 a"
    };
    
    @Override
    public char getKey1() 
    {
        return 'l';
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
        case 'k': return("心");
        case 'i': return("色");
        case 'c': return("也");

        case '1': return("乙");
        case '2': return("毛");

        case 'a': return("兄");

        }
        
        return null;
    }
}
