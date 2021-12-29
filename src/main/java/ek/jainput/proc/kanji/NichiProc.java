package ek.jainput.proc.kanji;

public class NichiProc implements KanjiProc
{
    @Override
    public char getKey1() 
    {
        return 'n';
    }
    
    @Override
    public String getHelp1() 
    {
        return "1 = 罒, 2 = 日, 3 = 目, 4 = 皿, c = 血, h = 百, i = 貝";
    }

    @Override
    public String getHelp2() 
    {
        return "j = 自, k = 首, s = 白";
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
