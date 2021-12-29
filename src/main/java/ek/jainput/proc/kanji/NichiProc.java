package ek.jainput.proc.kanji;

public class NichiProc implements KanjiProc
{
    private static final String[] helpText = 
    {
        "罒 1  日 2  目 3  皿 4  白 s  自 j  血 c",
        "貝 i  首 k  百 h"
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
        case '1': return("罒");

        case '2': return("日");
        case '3': return("目");
        case '4': return("皿");

        case 's': return("白");
        case 'j': return("自");
        case 'c': return("血");
        
        case 'h': return("百");
        case 'i': return("貝");
        
        case 'k': return("首");
        
        }
        
        return null;
    }
}
