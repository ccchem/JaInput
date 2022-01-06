package ek.jainput.proc.kanji.box;

import ek.jainput.proc.kanji.SecondKeyMap;

public class BoxesWKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "田 2  曲 3  毎 m  車 k  乗 n"
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
        case '2': return("田");
        case '3': return("曲");        

        case 'm': return("毎");
        case 'k': return("車");
        
        case 'n': return("乗");        

        }
        
        return null;
    }
}
