package ek.jainput.proc.kanji;

public class SingleKeyMap
{
    private char[] keyMap = new char[128];

    
    public SingleKeyMap()
    {
        initLetters();
        initOther();
    }

    public char get(char ch)
    {
        return keyMap[ch];
    }
    
    private void initOther()
    {
        keyMap['`'] = '丶';
        keyMap['~'] = '冫';
        
        keyMap['_'] = '一';
        
        keyMap['+'] = '十';
        keyMap['='] = '二';
        
        keyMap['/'] = 'ノ';        
        
        keyMap['!'] = '人';
        
        
        keyMap['@'] = '火';
        
        keyMap['3'] = '.';
        keyMap['#'] = '井';

        keyMap['4'] = '厶';
        
        keyMap['5'] = '五';
        
        keyMap['&'] = '匕';

        keyMap['8'] = '八';
        keyMap['*'] = '米';
        
        keyMap['9'] = '九';        
        keyMap['0'] = '園';
        
        keyMap['{'] = '斤';
                
        keyMap['\''] = '道';
        keyMap['"'] = '廿';
    }

    
    private void initLetters()
    {
        keyMap['A'] = '日';

        keyMap['B'] = '月';
        
        keyMap['c'] = '金';
        //keyMap['C'] = '子';
        //keyMap['C'] = '子';

        keyMap['d'] = '.';
        keyMap['D'] = '.';

        keyMap['e'] = 'ヨ';
        keyMap['E'] = '隹';

        keyMap['f'] = '中';
        keyMap['F'] = '巾';

        keyMap['G'] = '土';

        keyMap['h'] = '竹';
        keyMap['H'] = '牛';

        keyMap['i'] = '糸';
        keyMap['I'] = '王';

        keyMap['J'] = '小';

        keyMap['K'] = '木';

        keyMap['l'] = '心';
        keyMap['L'] = '儿';

        keyMap['M'] = '水';

        keyMap['n'] = '.';
        keyMap['N'] = '.';

        keyMap['O'] = '大';

        keyMap['p'] = '尸';
        keyMap['P'] = '卩';

        keyMap['q'] = '手';
        keyMap['Q'] = '.';

        keyMap['R'] = '口';

        keyMap['S'] = '阝';

        keyMap['t'] = '立';
        keyMap['T'] = '夕';

        keyMap['u'] = '言';
        keyMap['U'] = '.';

        keyMap['V'] = '女';

        keyMap['W'] = '田';
        
        keyMap['x'] = '乂';
        keyMap['X'] = '丬';
        
        keyMap['y'] = '卜';
        keyMap['Y'] = '止';
        
        keyMap['z'] = '漢';
        
    }

}
