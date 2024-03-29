package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class W_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "毎 m  車 k  重 o  更 x  曲 3  再 s"
    };
    
    @Override
    public char getKey1() 
    {
        return 'w';
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
        case '3': return("曲");        

        case 'm': return("毎");
        case 's': return("再");        

        case 'k': return("車");        
        case 'o': return("重");

        case 'x': return("更");
        
        }
        
        return null;
    }
}
