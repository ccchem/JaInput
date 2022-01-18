package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class RB_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "气 4  州 s  ノ /"
    };
    
    @Override
    public char getKey1() 
    {
        return ']';
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
        case '/': return("ノ");
        
        case '4': return("气");
        
        case 's': return("州");        

        }
        
        return null;
    }
}
