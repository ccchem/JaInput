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
        
        keyMap['7'] = '子';
        
        keyMap['='] = '癶';
        keyMap['/'] = 'ノ';
                
        keyMap['a'] = '目';
        keyMap['b'] = '几';        

        keyMap['f'] = '中';
        keyMap['g'] = '也';
        
        keyMap['h'] = '竹';
        keyMap['i'] = '工';
        keyMap['j'] = '丁';        
        
        keyMap['r'] = '力';        
        
        keyMap['3'] = '阝';
    }
}
