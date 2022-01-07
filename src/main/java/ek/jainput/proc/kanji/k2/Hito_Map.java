package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Hito_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "人 h  彳 2  入 u  行 x  以 i",
        "欠 a"
    };

    @Override
    public char getKey1() 
    {
        return '1';
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
        case 'h': return("人");
        case 'u': return("入");
        
        case 'i': return("以");
        
        case '2': return("彳");
        case 'x': return("行");

        case 'a': return("欠");

        }
        
        return null;
    }
}
