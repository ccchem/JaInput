package ek.jainput.proc.kanji.box;

import ek.jainput.proc.kanji.SecondKeyMap;

public class B_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "月 g  用 y  冂 1  几 2  身 m  舟 f  鳥 t"
    };
    
    @Override
    public char getKey1() 
    {
        return 'b';
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
        case 'g': return("月");
        case 'y': return("用");
        case 'm': return("身");
        case 'f': return("舟");
        case 't': return("鳥");        

        case '1': return("冂");
        case '2': return("几");

        }
        
        return null;
    }
}
