package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class X_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "弋 i  戈 h  斗 t  飛 b  区 x  父 c"
    };
    
    @Override
    public char getKey1() 
    {
        return 'x';
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
        case 'i': return("弋");
        case 'h': return("戈");
        case 't': return("斗");
        case 'b': return("飛");

        case 'x': return("区");
        case 'c': return("父");
        
        }
        
        return null;
    }
}
