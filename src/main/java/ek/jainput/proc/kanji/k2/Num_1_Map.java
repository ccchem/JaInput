package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Num_1_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "人 1  行 2  火 3  入 i  久 h  欠 k"
    };

    @Override
    public char getKey1() 
    {
        return '1';
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
        case '1': return("人");
        case '2': return("行");
        case '3': return("火");

        case 'i': return("入");
        case 'h': return("久");
        case 'k': return("欠");

        }
        
        return null;
    }
}
