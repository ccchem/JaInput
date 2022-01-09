package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class S_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "耳 m  弓 y  門 k"
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
        case 'm': return("耳");
        case 'y': return("弓");

        case 'k': return("門");
        
        //case 'm': return("命");        
        //case 'r': return("令");
        }
        
        return null;
    }
}
