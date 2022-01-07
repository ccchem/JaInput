package ek.jainput.proc.kanji.box;

import ek.jainput.proc.kanji.SecondKeyMap;

public class A_Map implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "日 2  目 3  皿 4  耳 m  貝 k  首 b  頁 p"
        // 具 g    百 h 
    };
    
    @Override
    public char getKey1() 
    {
        return 'a';
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
        case '2': return("日");
        case '3': return("目");
        case '4': return("皿");

        case 'k': return("貝");
        case 'm': return("耳");

        case 'b': return("首");
        case 'p': return("頁");

        }
        
        return null;
    }
}
