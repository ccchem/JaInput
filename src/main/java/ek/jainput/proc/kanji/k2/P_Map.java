package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class P_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "尸 1  卩 2  方 h"
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
        case '1': return("尸");
        case '2': return("卩");
        
        case 'h': return("方");

        }
        
        return null;
    }
}
