package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class A_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "日 1  目 2  皿 3  百 h"
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
        case '1': return("日");
        case '2': return("目");
        case '3': return("皿");
        
        case 'h': return("百");
        
        }
        
        return null;
    }
}
