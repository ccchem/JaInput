package ek.jainput.proc.kanji.lines;

import ek.jainput.proc.kanji.SecondKeyMap;

public class XKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "夂 f  攵 h  又 m  乂 x"
    };
    
    @Override
    public char getKey1() 
    {
        return 'x';
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

        case 'x': return("乂");
        }
        
        return null;
    }
}
