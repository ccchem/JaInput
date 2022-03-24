package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class C2_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "春 h  巻 m  挙 a",
    };
    
    @Override
    public char getKey1() 
    {
        return 'C';
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
        case 'h': return("春");
        case 'm': return("巻");
        case 'a': return("挙");        
        
        }
        
        return null;
    }
}
