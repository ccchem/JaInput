package ek.jainput.proc.kanji.box;

import ek.jainput.proc.kanji.SecondKeyMap;

public class BoxesWKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "田 t  毎 m  車 k  東 h  乗 n"
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
        case 't': return("田");
        case 'm': return("毎");
        case 'k': return("車");
        
        case 'h': return("東");        
        case 'n': return("乗");        

        }
        
        return null;
    }
}
