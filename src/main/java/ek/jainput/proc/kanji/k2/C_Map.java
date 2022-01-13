package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class C_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "金 c  食 b  谷 t",
    };
    
    @Override
    public char getKey1() 
    {
        return 'c';
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
        case 'c': return("金");
        case 'b': return("食");
        
        case 't': return("谷");
        
        }
        
        return null;
    }
}
