package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class B_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "月 1  用 2  冊 3  几 4  身 s"
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
        case '1': return("月");
        case '2': return("用");
        case '3': return("冊");
        case '4': return("几");

        case 's': return("身");
        
        }
        
        return null;
    }
}
