package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class D_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "東 e  西 w  北 n  南 s  前 m  後 a"
    };
    
    @Override
    public char getKey1() 
    {
        return 'd';
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
        case 'e': return("東");
        case 'w': return("西");
        case 'n': return("北");
        case 's': return("南");

        case 'm': return("前");
        case 'a': return("後");
        
        }
        
        return null;
    }
}
