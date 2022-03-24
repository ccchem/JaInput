package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Q_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "手 1  寺 t  寸 s  丁 c  才 2  予 a"
    };
    
    @Override
    public char getKey1() 
    {
        return 'q';
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
        case '1': return("手");
        
        case 't': return("寺");
        case 's': return("寸");        
        
        case 'c': return("丁");
        case '2': return("才");
        
        case 'a': return("予");

        }
        
        return null;
    }
}
