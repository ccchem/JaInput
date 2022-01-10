package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class O_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "火 h  犬 i  矢 y"
    };
    
    @Override
    public char getKey1() 
    {
        return 'o';
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
        case 'h': return("火");
        case 'i': return("犬");
        case 'y': return("矢");

        }
        
        return null;
    }
}
