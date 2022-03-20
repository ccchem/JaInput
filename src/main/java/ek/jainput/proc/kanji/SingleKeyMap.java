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
        
        keyMap['-'] = '一';
        keyMap['_'] = '二';
        
        keyMap['+'] = '宀';
        keyMap['='] = '十';

        keyMap['/'] = '人';
        keyMap['?'] = '火';
                
        keyMap['!'] = '行';
        keyMap['@'] = '.';
        
        keyMap['3'] = '三';
        keyMap['#'] = '井';

        keyMap['4'] = '厶';
        keyMap['$'] = '至';
        
        keyMap['5'] = '五';
        
        keyMap['6'] = '八';
        keyMap['^'] = '六';
        
        keyMap['7'] = '匕';
        keyMap['&'] = '比';        

        keyMap['8'] = '.';
        keyMap['*'] = '米';
        
        keyMap['9'] = '九';
        
        keyMap['0'] = '口';
        keyMap[')'] = '園';
        
        keyMap['{'] = '斤';
                
        keyMap['\''] = '道';
        keyMap['"'] = '廿';
    }

    
    private void initLetters()
    {
        keyMap['A'] = '日';
        keyMap['B'] = '月';        
        keyMap['C'] = '.';

        keyMap['D'] = '.';

        keyMap['E'] = 'ヨ';

        keyMap['f'] = '中';
        keyMap['F'] = '巾';

        keyMap['G'] = '土';

        keyMap['H'] = '門';

        keyMap['i'] = '糸';
        keyMap['I'] = '王';

        keyMap['J'] = '小';

        keyMap['K'] = '木';

        keyMap['L'] = '心';

        keyMap['M'] = '水';

        keyMap['n'] = '.';
        keyMap['N'] = '.';

        keyMap['O'] = '大';

        keyMap['P'] = '尸';

        keyMap['q'] = '手';
        keyMap['Q'] = '丁';
        
        keyMap['R'] = '刀';
        keyMap['S'] = '弓';

        keyMap['T'] = '立';

        keyMap['u'] = '言';
        keyMap['U'] = '山';

        keyMap['v'] = '女';
        keyMap['V'] = '衣';

        keyMap['W'] = '田';
        
        keyMap['X'] = '丬';
        
        keyMap['y'] = '卜';
        keyMap['Y'] = '止';
        
        keyMap['z'] = '漢';
        
    }

}
