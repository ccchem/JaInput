package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class HLinesKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "冂 d  几 t  凵 u  匚 r  厂 1  广 2  疒 3"
    };
    
    @Override
    public char getKey1() 
    {
        return '[';
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
        case '1': return("厂");
        case '2': return("广");
        case '3': return("疒");

        case 'd': return("冂");
        case 't': return("几");
        case 'u': return("凵");
        case 'r': return("匚");
        }
        
        return null;
    }
}
