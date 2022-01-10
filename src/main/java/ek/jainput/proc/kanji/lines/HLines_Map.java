package ek.jainput.proc.kanji.lines;

import ek.jainput.proc.kanji.SecondKeyMap;

public class HLines_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "宀 3  气 4  気 k  彡 /"
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
        case '3': return("宀");

        case '4': return("气");
        case 'k': return("気");
        
        case '/': return("彡");
        }
        
        return null;
    }
}
