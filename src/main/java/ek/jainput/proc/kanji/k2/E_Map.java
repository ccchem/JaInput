package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class E_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "ヨ e  事 k  長 n  非 h  巨 1  臣 2"
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
        case 'e': return("ヨ");
        case 'k': return("事");

        case 'n': return("長");
        
        case '1': return("巨");
        case '2': return("臣");
                
        case 'h': return("非");
        }
        
        return null;
    }
}
