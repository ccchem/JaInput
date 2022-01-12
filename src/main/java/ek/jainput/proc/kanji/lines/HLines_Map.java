package ek.jainput.proc.kanji.lines;

import ek.jainput.proc.kanji.SecondKeyMap;

public class HLines_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "气 4"
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
        case '4': return("气");
        }
        
        return null;
    }
}
