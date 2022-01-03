package ek.jainput.proc.kanji.k2;

import ek.jainput.proc.kanji.SecondKeyMap;

public class BoxesKMap implements SecondKeyMap
{
    private static final String[] helpText = 
    {
        "口 1  日 2  目 3  皿 4  耳 m  月 g  貝 k",
        "園 0  国 z"
        // 具 g  首 k  百 h  頁 p
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
        case '0': return("園");
        case 'z': return("国");        
        
        case '1': return("口");
        case '2': return("日");
        case '3': return("目");
        case '4': return("皿");

        case 'g': return("月");
        case 'm': return("耳");
        case 'k': return("貝");

        }
        
        return null;
    }
}
