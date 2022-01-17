package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class A_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "皿 4  貝 k  見 m  頁 p  直 c"
    };
    
    @Override
    public char getKey1() 
    {
        return 'a';
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
        case '4': return("皿");

        case 'k': return("貝");
        case 'm': return("見");

        case 'p': return("頁");
        case 'c': return("直");
        
        }
        
        return null;
    }
}
