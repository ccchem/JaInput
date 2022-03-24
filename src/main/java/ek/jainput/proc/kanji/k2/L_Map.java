package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class L_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "兄 a  毛 k  也 c  乙 1"
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
        case 'a': return("兄");
        case 'c': return("也");
        case 'k': return("毛");
        case '1': return("乙");
        
        }
        
        return null;
    }
}
