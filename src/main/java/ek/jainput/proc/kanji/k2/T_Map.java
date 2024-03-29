package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class T_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "立 t  音 o  幸 s  新 a  夕 y"
    };
    
    @Override
    public char getKey1() 
    {
        return 't';
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
        case 't': return("立");        
        case 'o': return("音");
        case 's': return("幸");
        
        case 'a': return("新");        

        case 'y': return("夕");

        }
        
        return null;
    }
}
