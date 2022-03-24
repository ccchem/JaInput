package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class B2_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "同 o  周 m  舟 f"
    };
    
    @Override
    public char getKey1() 
    {
        return 'B';
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

        case 's': return("身");

        }
        
        return null;
    }
}
