package ek.jainput.proc.kanji;

public class KaneProc implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "介 2    会 4  合 a  全 z  ",
        "令 r  命 p  僉 x"
    };
    
    @Override
    public char getKey1() 
    {
        return 'c';
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
