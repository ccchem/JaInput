package ek.jainput.proc.kanji;

public class NakaProc implements KanjiProc
{
    private static final String[] helpText = 
    {
        "中 1  虫 m  史 s  _ a  使 t  _ t  _ c",
        "_ r  _ p  _ x"
    };
    
    @Override
    public char getKey1() 
    {
        return 'f';
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
        case '1': return("中");
        case 'm': return("虫");
        case 's': return("史");

        }
        
        return null;
    }
}
