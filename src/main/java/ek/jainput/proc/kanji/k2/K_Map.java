package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class K_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "本 h  采 i  束 b  東 t  業 g"
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
        
        case 'b': return("束");
        case 't': return("東");
        
        case 'i': return("采");
        case 'g': return("業");        
        
        }
        
        return null;
    }
}
