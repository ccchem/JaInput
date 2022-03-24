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
        keyMap['0'] = '園';
        
        keyMap['='] = '癶';
        keyMap['/'] = '者';

        keyMap['a'] = '目';
        keyMap['b'] = '几';        
        
        keyMap['e'] = '隹';
        keyMap['f'] = '中';
        keyMap['g'] = '干';
        
        keyMap['h'] = '竹';
        keyMap['i'] = '糸';
        keyMap['j'] = '示';        
        
        keyMap['k'] = '禾';
        keyMap['l'] = '儿';
        keyMap['m'] = '又';
        
        keyMap['p'] = '卩';
        keyMap['q'] = '可';        
        keyMap['r'] = '力';
        keyMap['t'] = '夕';        
                
        keyMap['u'] = '川';
        keyMap['v'] = '戈';        
        
    }
}
