package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class V_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "女 o  子 k  予 a  凵 u"
    };

    @Override
    public char getKey1() 
    {
        return 'v';
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
        case 'o': return("女");
        case 'k': return("子");        
        
        case 'a': return("予");
        
        case 'u': return("凵");
        
        }
        
        return null;
    }
}
