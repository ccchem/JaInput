package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class K_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "禾 2"
    };

    @Override
    public char getKey1() 
    {
        return 'k';
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
        case '2': return("禾");
        }
        
        return null;
    }
}
