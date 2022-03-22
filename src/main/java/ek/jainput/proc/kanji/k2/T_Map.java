package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class T_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "音 o  幸 s  新 a"
    };
    
    @Override
    public char getKey1() 
    {
        return 't';
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
        
        case 'o': return("音");
        case 's': return("幸");
        
        case 'a': return("新");        
        
        }
        
        return null;
    }
}
