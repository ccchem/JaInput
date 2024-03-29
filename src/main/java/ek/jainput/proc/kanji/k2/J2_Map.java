package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class J2_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "勹 1  勿 2  昜 3  易 y  豕 b  羽 w"
    };
    
    @Override
    public char getKey1() 
    {
        return 'J';
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
        case '1': return("勹");
        case '2': return("勿");
        case '3': return("昜");
        case 'y': return("易");
        
        case 'b': return("豕");
        
        case 'w': return("羽");
        
        }
        
        return null;
    }
}
