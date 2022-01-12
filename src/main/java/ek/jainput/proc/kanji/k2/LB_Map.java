package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class LB_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "反 h  皮 k  疒 3  氏 s"
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

        case '3': return("疒");

        case 's': return("氏");
        }
        
        return null;
    }
}
