package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Shapes_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "厂 0  广 1  疒 3  斤 4  皮 k  凵 u  匚 r"
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
        case '0': return("厂");
        case '1': return("广");
        case '3': return("疒");

        case '4': return("斤");
        case 'k': return("皮");

        case 'u': return("凵");
        case 'r': return("匚");
        }
        
        return null;
    }
}
