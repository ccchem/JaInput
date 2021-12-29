package ek.jainput.proc.kanji;

public class KaneProc implements KanjiProc
{
    @Override
    public char getKey1() 
    {
        return 'c';
    }

    @Override
    public String getHelp1() 
    {
        return "2 = 介, 4 = 会, a = 合, c = 金, i = 今, k = 界, p = 命";
    }
    
    @Override
    public String getHelp2() 
    { 
        return "r = 令, t = 食, x = 僉, z = 全";
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

        case 'k': return("界");
        case 'm': return("命");        
        
        case 'r': return("令");
        case 't': return("食");
                
        case 'x': return("僉");
        case 'z': return("全");
        }
        
        return null;
    }
}
