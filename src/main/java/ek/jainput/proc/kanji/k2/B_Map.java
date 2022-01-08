package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class B_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "周 1  高 t  咼 2  舟 f  用 y  冊 4  身 m"
    };
    
    @Override
    public char getKey1() 
    {
        return 'b';
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
        case '1': return("周");
        case 't': return("高");
        case '2': return("咼");

        case 'f': return("舟");

        case 'y': return("用");
        case '4': return("冊");

        case 'm': return("身");
        
        }
        
        return null;
    }
}
