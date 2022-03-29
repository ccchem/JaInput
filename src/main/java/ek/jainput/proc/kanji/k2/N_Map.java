package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class N_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "零 0  番 b  号 g  馬 u  鳥 t"
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

        case '0': return("零");
        case '1': return("一");
        case '2': return("二");
        case '3': return("三");        
        case '4': return("四");
        case '5': return("五");
        
        case '6': return("六");
        case '7': return("七");
        case '8': return("八");
        case '9': return("九");
                
        case 'b': return("番");
        case 'g': return("号");
        
        case 'u': return("馬");
        case 't': return("鳥");
        }
        
        return null;
    }
}
