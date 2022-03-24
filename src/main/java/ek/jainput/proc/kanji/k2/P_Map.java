package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class P_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "尸 p  卩 w  尺 r  高 t  咼 2  卵 3"
    };
    
    @Override
    public char getKey1() 
    {
        return 'p';
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
        case 'p': return("尸");
        case 'w': return("卩");
        case 'r': return("尺");
        
        case 't': return("高");
        case '2': return("咼");
        case '3': return("卵");
        
        }
        
        return null;
    }
}
