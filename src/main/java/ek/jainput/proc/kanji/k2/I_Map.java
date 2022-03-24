package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class I_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "王 o  生 s  羊 h  工 k  青 a  糸 i"
    };
    
    @Override
    public char getKey1() 
    {
        return 'i';
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
        
        case 'o': return("王");
        case 's': return("生");
        case 'h': return("羊");        

        case 'k': return("工");
        
        case 'a': return("青");
        
        case 'i': return("糸");
        
        }
        
        return null;
    }
}
