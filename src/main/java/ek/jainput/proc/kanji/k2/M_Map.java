package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class M_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "夂 f  攵 h  又 m  雨 a  門 k"
    };
    
    @Override
    public char getKey1() 
    {
        return 'm';
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
        case 'f': return("夂");
        case 'h': return("攵");
        case 'm': return("又");

        case 'a': return("雨");
        case 'k': return("門");
        
        }
        
        return null;
    }
}
