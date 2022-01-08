package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class O_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "犬 i  天 t  夫 o  矢 y  失 s"
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
        case 'i': return("犬");
        case 't': return("天");
        case 'o': return("夫");

        case 'y': return("矢");
        case 's': return("失");        

        }
        
        return null;
    }
}
