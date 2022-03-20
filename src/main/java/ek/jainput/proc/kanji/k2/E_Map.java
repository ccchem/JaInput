package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class E_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "非 h  馬 u  巨 k  臣 s"
    };
    
    @Override
    public char getKey1() 
    {
        return 'e';
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
        case 'k': return("巨");
        case 's': return("臣");
                
        case 'h': return("非");
        case 'u': return("馬");
        }
        
        return null;
    }
}
