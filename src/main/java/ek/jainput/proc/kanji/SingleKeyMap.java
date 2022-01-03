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
        keyMap['-'] = '一';
        
        keyMap['+'] = '十';
        keyMap['='] = '二';
        
        keyMap['/'] = 'ノ';        
        
        keyMap['1'] = '人';
        keyMap['!'] = '彳';
        
        keyMap['2'] = '勹';
        keyMap['@'] = '已';
        
        keyMap['3'] = '阝';
        keyMap['#'] = '井';

        keyMap['4'] = '厶';
        keyMap['$'] = '糸';
        
        keyMap['5'] = '五';
        
        keyMap['7'] = '七';
        keyMap['&'] = '衣';

        keyMap['8'] = '八';
        keyMap['*'] = '米';
        
        keyMap['9'] = '九';
        
        keyMap['0'] = '園';
                
        keyMap['\''] = '弋';
        keyMap['"'] = '廿';
    }

    
    private void initLetters()
    {
        keyMap['a'] = '日';
        keyMap['A'] = '目';

        keyMap['b'] = '月';
        keyMap['B'] = '用';
        
        keyMap['c'] = '金';
        //keyMap['C'] = '子';
        //keyMap['C'] = '子';

        keyMap['d'] = '力';
        keyMap['D'] = '.';

        keyMap['e'] = 'ヨ';
        keyMap['E'] = '隹';

        keyMap['f'] = '中';
        keyMap['F'] = '巾';

        keyMap['G'] = '土';

        keyMap['h'] = '竹';
        keyMap['H'] = '門';

        keyMap['i'] = '.';
        keyMap['I'] = '工';

        keyMap['j'] = '小';
        keyMap['J'] = '寸';

        keyMap['k'] = '木';
        keyMap['K'] = '禾';

        keyMap['l'] = '心';
        keyMap['L'] = '儿';

        keyMap['m'] = '水';
        keyMap['M'] = '雨';

        keyMap['n'] = '.';
        keyMap['N'] = '.';

        keyMap['o'] = '大';
        keyMap['O'] = '夕';

        keyMap['p'] = '尸';
        keyMap['P'] = '卩';

        keyMap['q'] = '手';
        keyMap['Q'] = '.';

        keyMap['r'] = '口';
        keyMap['R'] = '刀';

        keyMap['s'] = '.';
        keyMap['S'] = '.';

        keyMap['t'] = '斤';
        keyMap['T'] = '丁';

        keyMap['u'] = '言';
        keyMap['U'] = '.';

        keyMap['v'] = '女';
        keyMap['V'] = '火';

        keyMap['w'] = '田';
        keyMap['W'] = '山';
        
        keyMap['x'] = '乂';
        keyMap['X'] = '丬';
        
        keyMap['y'] = '卜';
        keyMap['Y'] = '止';
        
        keyMap['z'] = '難';
        
    }

}
