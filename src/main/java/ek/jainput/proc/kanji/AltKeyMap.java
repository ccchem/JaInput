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
        keyMap['='] = '癶';
        keyMap['/'] = 'ノ';
                
        keyMap['a'] = '目';
        keyMap['g'] = '也';
        keyMap['i'] = '工';
        
        keyMap['3'] = '阝';
    }
}
