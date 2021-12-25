package ek.jainput.proc;

public class KanjiKeyProcessor implements KeyProcessor
{
    private Callback cb;

    private char[] keyMap = new char[255];
    
    public KanjiKeyProcessor(Callback cb)
    {
        this.cb = cb;
        initKeyMap();
    }

    @Override
    public void processKey(char ch)
    {
        short idx = (short)ch;
        char kanji = keyMap[idx];
        if(kanji != 0)
        {
            cb.onText("" + kanji);
        }
    }

    
    private void initKeyMap()
    {
        keyMap['o'] = '人';
        keyMap['O'] = '入';
    }
}
