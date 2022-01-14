package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Hito_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "行 2  入 h"
    };

    @Override
    public char getKey1() 
    {
        return '1';
    }
    
    public String[] getHelp() 
    { 
        return helpText; 
    }
    
    @Override
    public String getKanji(char ch)
    {
        switch(ch)
        {
        case '2': return("行");
        case 'h': return("入");

        }
        
        return null;
    }
}
