package ek.jainput.proc.kanji;

public class N4Proc implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "厶 4  公 8  糸 i  _ m  _ s  _ b  _ u",
        "_ t  _ 8  _ h  _ r  _ 3"
    };

    @Override
    public char getKey1() 
    {
        return '4';
    }
    
    public String[] getHelp() 
    { 
        return helpText; 
    }
    
    @Override
    public String getKanji(char ch)
    {
        switch(ch)
        {
        case '4': return("厶");
        case '8': return("公");
        case 'i': return("糸");
        }
        
        return null;
    }
}
