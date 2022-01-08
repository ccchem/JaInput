package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class S_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "弓 3  已 2"
//        "令 r  命 p"
    };
    
    @Override
    public char getKey1() 
    {
        return 's';
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
        case '2': return("已");
        case '3': return("弓");

        //case 'm': return("命");        
        //case 'r': return("令");
        }
        
        return null;
    }
}
