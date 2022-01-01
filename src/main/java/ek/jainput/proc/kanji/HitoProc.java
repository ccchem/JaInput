package ek.jainput.proc.kanji;

public class HitoProc implements KanjiProc
{
    private static final String[] helpText = 
    {
        "人 h  亻 1  彳 2  入 u  行 x  火 k  以 i",
        "八 8  分 b  谷 9  欠 r  次 t"
    };

    @Override
    public char getKey1() 
    {
        return '1';
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
        case 'h': return("人");
        case 'i': return("以");
        
        case '1': return("亻");
        case '2': return("彳");
        case '8': return("八");
        case '9': return("谷");

        case 'b': return("分");
        case 'k': return("火");
        case 'r': return("欠");
        case 't': return("次");
        case 'u': return("入");
        case 'x': return("行");

        }
        
        return null;
    }
}
