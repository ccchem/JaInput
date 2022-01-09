package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class C_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "金 c  今 i  食 b  合 a",
        "令 r  命 p"
    };
    
    @Override
    public char getKey1() 
    {
        return 'c';
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
        case 'c': return("金");
        case 'i': return("今");
        case 'b': return("食");

        case 'a': return("合");

        //case 'a': return("合");
        case 'r': return("令");
        case 'p': return("命");        

        }
        
        return null;
    }
}
