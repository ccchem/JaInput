package ek.jainput.proc.kanji;

public class AltKeyMap
{
    private char[] keyMap = new char[128];
    
    public AltKeyMap()
    {
        init();
    }

    public char get(char ch)
    {
        return keyMap[ch];
    }

    
    private void init()
    {
        keyMap['3'] = '阝';
                
        keyMap['6'] = '今';
        keyMap['7'] = '子';
        
        keyMap['='] = '癶';
        keyMap['/'] = 'ノ';
                
        keyMap['a'] = '目';
        keyMap['b'] = '几';        
        
        keyMap['e'] = '隹';
        keyMap['f'] = '中';
        keyMap['g'] = '干';
        
        keyMap['h'] = '竹';
        keyMap['i'] = '工';
        keyMap['j'] = '示';        
        
        keyMap['l'] = '也';
        keyMap['m'] = '又';
        
        keyMap['p'] = '卩';
        keyMap['q'] = '可';        
        keyMap['r'] = '力';
        
        keyMap['v'] = '戈';        
        
    }
}
