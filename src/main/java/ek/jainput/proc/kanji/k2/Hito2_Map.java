package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Hito2_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "巻 m  以 i  欠 a  疋 e  入 h",
    };

    @Override
    public char getKey1() 
    {
        return '2';
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
        case 'm': return("巻");
        
        case 'i': return("以");
        
        case 'a': return("欠");
        case 'e': return("疋");
        
        case 'h': return("入");
        
        }
        
        return null;
    }
}
