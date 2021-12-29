package ek.jainput.proc.kanji;

public class HitoProc implements KanjiProc
{
    @Override
    public char getKey1() 
    {
        return '1';
    }
    
    public String getHelp1() 
    { 
        return "h = 人, 1 = 亻, 2 = 彳, 4 = 公, 8 = 八, 9 = 谷, b = 分"; 
    }
    
    public String getHelp2() 
    { 
        return "i = 今, k = 火, r = 欠, t = 次, u = 入, x = 行, z = 隹";
    }
    
    @Override
    public String getKanji(char ch)
    {
        switch(ch)
        {
        case 'h': return("人");
        
        case '1': return("亻");
        case '2': return("彳");
        case '4': return("公");
        case '8': return("八");
        case '9': return("谷");

        case 'b': return("分");
        case 'k': return("火");
        case 'r': return("欠");
        case 't': return("次");
        case 'u': return("入");
        case 'x': return("行");
        case 'z': return("隹");

        }
        
        return null;
    }
}
