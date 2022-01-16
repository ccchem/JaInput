package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class J_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "勹 1  勿 3  豕 b  予 a"
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
        case '1': return("勹");
        case '3': return("勿");
        case 'b': return("豕");
        
        case 'a': return("予");
        }
        
        return null;
    }
}
