package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class A_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "目 3  皿 4  貝 k  見 m  頁 p"
        // 具 g    百 h 
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
        case '3': return("目");
        case '4': return("皿");

        case 'k': return("貝");
        case 'm': return("見");

        case 'p': return("頁");

        }
        
        return null;
    }
}
