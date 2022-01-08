package ek.jainput.proc.kanji.lines;

import ek.jainput.proc.kanji.SecondKeyMap;

public class E_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "ヨ e  乍 n  非 h  臣 s  隹 z"
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
        case 'n': return("乍");
        case 's': return("臣");
                
        case 'h': return("非");
        case 'z': return("隹");
        }
        
        return null;
    }
}
