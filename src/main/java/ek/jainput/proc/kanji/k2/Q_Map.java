package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class Q_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "手 t  毛 k  丁 c  予 a  可 m"
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
        case 't': return("手");
        case 'k': return("毛");

        case 'c': return("丁");
        case 'a': return("予");

        }
        
        return null;
    }
}
