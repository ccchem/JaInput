package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class F_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "禾 2  耒 3  未 m  末 s"
    };

    @Override
    public char getKey1() 
    {
        return 'k';
    }
    
    public String[] getHelp() 
    { 
        return helpText; 
    }
    
    @Override
    public String getKanji(char ch)
    {
        switch(ch)
        {
        case '2': return("禾");
        case '3': return("耒");        

        case 'm': return("未");
        case 's': return("末");
        
        }
        
        return null;
    }
}
