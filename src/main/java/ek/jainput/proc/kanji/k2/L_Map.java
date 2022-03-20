package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class L_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "兄 a  也 c"
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

        }
        
        return null;
    }
}
