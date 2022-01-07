package ek.jainput.proc.kanji.box;

import ek.jainput.proc.kanji.SecondKeyMap;

public class W_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "曲 3  毎 m  車 k  重 o  乗 n"
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
        case 'k': return("車");
        case 'o': return("重");        
        
        case 'n': return("乗");        

        }
        
        return null;
    }
}
