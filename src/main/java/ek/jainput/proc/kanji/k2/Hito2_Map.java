package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Hito2_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "以 i  疋 1  走 h",
    };

    @Override
    public char getKey1() 
    {
        return '2';
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
        case 'i': return("以");
        case '1': return("疋");
        case 'h': return("走");
        
        }
        
        return null;
    }
}
