package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class K_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "本 h  材 z  禾 2  采 i"
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
        case 'h': return("本");
        case 'z': return("材");
        
        case '2': return("禾");
        
        case 'i': return("采");
        
        }
        
        return null;
    }
}
