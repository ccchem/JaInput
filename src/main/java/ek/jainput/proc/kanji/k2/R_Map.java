package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class R_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "方 h"
    };
    
    @Override
    public char getKey1() 
    {
        return 'r';
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

        }
        
        return null;
    }
}
