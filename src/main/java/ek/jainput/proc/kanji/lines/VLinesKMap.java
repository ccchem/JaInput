package ek.jainput.proc.kanji.lines;

import ek.jainput.proc.kanji.SecondKeyMap;

public class VLinesKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "丨 1  川 3  中 f  山 y  州 s",
        "巾 h"
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
        case '1': return("丨");
        case '3': return("川");
        
        case 'f': return("中");
        case 'y': return("山");
        case 's': return("州");        

        }
        
        return null;
    }
}
