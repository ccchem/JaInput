package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class LB_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "反 h  皮 k  病 b  氏 s"
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
        case 'h': return("反");
        case 'k': return("皮");

        case 'b': return("病");

        case 's': return("氏");
        }
        
        return null;
    }
}
