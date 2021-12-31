package ek.jainput.proc.kanji;

public class NakaProc implements KanjiProc
{
    private static final String[] helpText = 
    {
        "中 1  虫 m  厶 4  _ a  _ z  _ t  _ c",
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
        case '2': return("介");
        case '4': return("会");

        case 'a': return("合");
        case 'c': return("金");
        case 'i': return("今");

        case 'm': return("命");        
        
        case 'r': return("令");
        case 't': return("食");
                
        case 'x': return("僉");
        case 'z': return("全");
        }
        
        return null;
    }
}
