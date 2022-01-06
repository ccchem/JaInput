package ek.jainput.proc.kanji.lines;

import ek.jainput.proc.kanji.SecondKeyMap;

public class EKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "ヨ e  斗 t"
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
        case 't': return("斗");
        
        }
        
        return null;
    }
}
