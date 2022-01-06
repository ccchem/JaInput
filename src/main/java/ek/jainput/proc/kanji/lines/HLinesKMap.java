package ek.jainput.proc.kanji.lines;

import ek.jainput.proc.kanji.SecondKeyMap;

public class HLinesKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "亠 1  冖 2  宀 3  气 4  気 k"
    };
    
    @Override
    public char getKey1() 
    {
        return '-';
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
        case '1': return("亠");
        case '2': return("冖");
        case '3': return("宀");

        case '4': return("气");
        case 'k': return("気");
        }
        
        return null;
    }
}
