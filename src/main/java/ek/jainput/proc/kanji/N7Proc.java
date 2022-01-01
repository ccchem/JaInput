package ek.jainput.proc.kanji;

public class N7Proc implements KanjiProc
{
    private static final String[] helpText = 
    {
        "衣 i  衤 2  示 s  礻 1  _ s  _ b  _ u",
        "_ t  _ 8  _ h  _ r  _ 3"
    };

    @Override
    public char getKey1() 
    {
        return '7';
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
        case 'i': return("衣");
        case '1': return("礻");
        case 's': return("示");
        case '2': return("衤");
        }
        
        return null;
    }
}
