package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Slash_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "者 s  身 m  ノ /"
    };
    
    @Override
    public char getKey1() 
    {
        return '/';
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
        case 's': return("者");        
        case 'm': return("身");
        
        case '/': return("ノ");
        
        }
        
        return null;
    }
}
