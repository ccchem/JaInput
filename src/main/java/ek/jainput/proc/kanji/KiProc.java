package ek.jainput.proc.kanji;

public class KiProc implements KanjiProc
{
    private static final String[] helpText = 
    {
        "木 k  禾 2  本 -  未 m  末 s  米 b  来 u",
        "東 t  束 8  林 h  森 r  耒 3"
    };

    @Override
    public char getKey1() 
    {
        return 'k';
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
        case 'k': return("木");
        case '2': return("禾");
        case '3': return("耒");        
        case '-': return("本");

        case 'h': return("林");
        case 'r': return("森");        
        
        case 'm': return("未");
        case 's': return("末");
        
        case 'b': return("米");
        case 'u': return("来");
        
        case '8': return("束");
        case 't': return("東");
        
        
        }
        
        return null;
    }
}
