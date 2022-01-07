package ek.jainput.proc.kanji.lines;

import ek.jainput.proc.kanji.SecondKeyMap;

public class VLines_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "工 i  丨 1  川 3  山 y  州 s"
    };
    
    @Override
    public char getKey1() 
    {
        return ']';
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
        case 'i': return("工");
        case '1': return("丨");
        case '3': return("川");
        
        case 'y': return("山");
        case 's': return("州");        

        }
        
        return null;
    }
}
