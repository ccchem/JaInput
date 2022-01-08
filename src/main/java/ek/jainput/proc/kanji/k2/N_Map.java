package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class N_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "几 1  鳥 t"
    };
    
    @Override
    public char getKey1() 
    {
        return 'n';
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
        case '1': return("几");

        case 't': return("鳥");

        }
        
        return null;
    }
}
