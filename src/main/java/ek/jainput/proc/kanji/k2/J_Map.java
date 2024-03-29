package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class J_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "小 1  少 2  示 3  京 k"
    };
    
    @Override
    public char getKey1() 
    {
        return 'j';
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
        case '1': return("小");
        case '2': return("少");
        case '3': return("示");
        
        case 'k': return("京");
        }
        
        return null;
    }
}
