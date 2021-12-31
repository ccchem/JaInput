package ek.jainput.proc.kanji;

public class TakeProc implements KanjiProc
{
    private static final String[] helpText = 
    {
        "勹 1  竹 2  乍 3  勿 4  年 n  午 g  牛 u",
        "夕 y  多 o  作 t  昜 x  隹 z"
    };

    @Override
    public char getKey1() 
    {
        return 'h';
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
        case 'n': return("年");
        case 'g': return("午");
        case 'u': return("牛");
        
        case '1': return("勹");
        case '2': return("竹");
        case '3': return("乍");

        case 't': return("作");
        
        case '4': return("勿");
        case 'x': return("昜");
        
        case 'y': return("夕");
        case 'o': return("多");
        
        case 'z': return("隹");
        }
        
        return null;
    }
}
