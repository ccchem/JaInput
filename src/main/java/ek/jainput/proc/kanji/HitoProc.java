package ek.jainput.proc.kanji;

public class HitoProc
{
    public final static char KEY1 = '1';
    
    public final static String helpText1 = "h = 人, 1 = 亻, 2 = 彳, i = 今, k = 火, r = 欠"; 
    public final static String helpText2 = "t = 次, u = 入, x = 行, z = 隹";
    
    public static String getKanji(char ch)
    {
        switch(ch)
        {
        case 'h': return("人");
        case '1': return("亻");
        case '2': return("彳");
        case 'i': return("今");
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
