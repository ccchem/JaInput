package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class OokiKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "大 o  犬 i  太 f  天 t  矢 y  失 s  央 8",
        "夫 -  夬 7  夭 /  春 h"
    };
    
    @Override
    public char getKey1() 
    {
        return 'o';
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
        case 'o': return("大");
        case 't': return("天");

        case '7': return("夬");
        case '8': return("央");
        
        case 'i': return("犬");
        case 'f': return("太");

        case 'y': return("矢");
        case 's': return("失");        
        
        case '-': return("夫");
        case '/': return("夭");
        
        case 'h': return("春");        
        
        }
        
        return null;
    }
}
