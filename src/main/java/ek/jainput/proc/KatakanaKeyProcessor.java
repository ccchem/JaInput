package ek.jainput.proc;


public class KatakanaKeyProcessor implements KeyProcessor
{
    private Callback cb;
    
    private char key1 = ' ';

    
    /**
     * Constructor
     * @param cb callback interface implementation
     */
    public KatakanaKeyProcessor(Callback cb)
    {
        this.cb = cb;
    }

    
    /**
     * Process next input character
     * @param ch input ASCII character
     */
    public void processKey(char ch)
    {
        switch(ch)
        {
        case 'a': do_A(); break;
        case 'i': do_I(); break;
        case 'u': do_U(); break;
        case 'e': do_E(); break;
        case 'o': do_O(); break;
        case '-': cb.onText("ー"); break;
        
        case ' ': cb.onText("　"); break;
        case ',': cb.onText("、"); break;
        case '.': cb.onText("。"); break;
        case '?': cb.onText("？"); break;
        case '!': cb.onText("！"); break;
        
        case '0': cb.onText("０"); break;
        case '1': cb.onText("１"); break;
        case '2': cb.onText("２"); break;
        case '3': cb.onText("３"); break;
        case '4': cb.onText("４"); break;
        case '5': cb.onText("５"); break;
        case '6': cb.onText("６"); break;
        case '7': cb.onText("７"); break;
        case '8': cb.onText("８"); break;
        case '9': cb.onText("９"); break;
        
        case 'k': key1 = ch; break;
        case 'g': key1 = ch; break;

        case 's': key1 = ch; break;
        case 'z': key1 = ch; break;
        case 'j': key1 = ch; break;

        case 't': key1 = ch; break;
        case 'T': key1 = ' '; cb.onText("ッ"); break;
        case 'd': key1 = ch; break;

        case 'n': key1 = ch; break;
        case 'N': key1 = ' '; cb.onText("ン"); break;
        case 'm': key1 = ch; break;
        
        case 'h': key1 = ch; break;
        case 'b': key1 = ch; break;
        case 'p': key1 = ch; break;

        case 'y': key1 = ch; break;
        
        case 'r': key1 = ch; break;
        
        case 'w': key1 = ch; break;

        // Small
        case 'x': key1 = ch; break;
        case 'q': key1 = ch; break;

        }
    }

    
    private void do_A()
    {
        switch(key1)
        {
        case ' ': cb.onText("ア"); break;
        case 'q': cb.onText("ァ"); break;    // Small
        
        case 'k': cb.onText("カ"); break;
        case 'g': cb.onText("ガ"); break;
        
        case 's': cb.onText("サ"); break;
        case 'z': cb.onText("ザ"); break;
        
        case 't': cb.onText("タ"); break;
        case 'd': cb.onText("ダ"); break;
        
        case 'n': cb.onText("ナ"); break;
        case 'm': cb.onText("マ"); break;

        case 'h': cb.onText("ハ"); break;
        case 'b': cb.onText("バ"); break;
        case 'p': cb.onText("パ"); break;

        case 'y': cb.onText("ヤ"); break;
        case 'r': cb.onText("ラ"); break;
        case 'w': cb.onText("ワ"); break;
        
        case 'x': cb.onText("ャ"); break;    // Small
        }
        
        key1 = ' ';
    }

    
    private void do_I()
    {
        switch(key1)
        {
        case ' ': cb.onText("イ"); break;
        case 'q': cb.onText("ィ"); break;    // Small
        
        case 'k': cb.onText("キ"); break;
        case 'g': cb.onText("ギ"); break;
        
        case 's': cb.onText("シ"); break;
        case 'z': cb.onText("ジ"); break;
        
        case 't': cb.onText("チ"); break;
        case 'd': cb.onText("ヂ"); break;
        
        case 'n': cb.onText("ニ"); break;
        case 'm': cb.onText("ミ"); break;

        case 'h': cb.onText("ヒ"); break;
        case 'b': cb.onText("ビ"); break;
        case 'p': cb.onText("ピ"); break;

        case 'r': cb.onText("リ"); break;
        }
        
        key1 = ' ';
    }

    
    private void do_U()
    {
        switch(key1)
        {
        case ' ': cb.onText("ウ"); break;
        case 'q': cb.onText("ゥ"); break;    // Small
        
        case 'k': cb.onText("ク"); break;
        case 'g': cb.onText("グ"); break;
        
        case 's': cb.onText("ス"); break;
        case 'z': cb.onText("ズ"); break;
        
        case 't': cb.onText("ツ"); break;
        case 'd': cb.onText("ヅ"); break;
        
        case 'n': cb.onText("ヌ"); break;
        case 'm': cb.onText("ム"); break;

        case 'h': cb.onText("フ"); break;
        case 'b': cb.onText("ブ"); break;
        case 'p': cb.onText("プ"); break;

        case 'y': cb.onText("ユ"); break;
        case 'r': cb.onText("ル"); break;

        // Small
        case 'x': cb.onText("ュ"); break;
        }
        
        key1 = ' ';
    }

    
    private void do_E()
    {
        switch(key1)
        {
        case ' ': cb.onText("エ"); break;
        case 'q': cb.onText("ェ"); break;    // Small
        
        case 'k': cb.onText("ケ"); break;
        case 'g': cb.onText("ゲ"); break;
        
        case 's': cb.onText("セ"); break;
        case 'z': cb.onText("ゼ"); break;
        
        case 't': cb.onText("テ"); break;
        case 'd': cb.onText("デ"); break;
        
        case 'n': cb.onText("ネ"); break;
        case 'm': cb.onText("メ"); break;

        case 'h': cb.onText("ヘ"); break;
        case 'b': cb.onText("ベ"); break;
        case 'p': cb.onText("ペ"); break;

        case 'r': cb.onText("レ"); break;
        }
        
        key1 = ' ';
    }

    
    private void do_O()
    {
        switch(key1)
        {
        case ' ': cb.onText("オ"); break;
        case 'q': cb.onText("ォ"); break;    // Small

        case 'k': cb.onText("コ"); break;
        case 'g': cb.onText("ゴ"); break;
        
        case 's': cb.onText("ソ"); break;
        case 'z': cb.onText("ゾ"); break;
        
        case 't': cb.onText("ト"); break;
        case 'd': cb.onText("ド"); break;
        
        case 'n': cb.onText("ノ"); break;
        case 'm': cb.onText("モ"); break;

        case 'h': cb.onText("ホ"); break;
        case 'b': cb.onText("ボ"); break;
        case 'p': cb.onText("ポ"); break;

        case 'y': cb.onText("ヨ"); break;
        case 'r': cb.onText("ロ"); break;
        case 'w': cb.onText("ヲ"); break;
        
        case 'x': cb.onText("ョ"); break;    // Small
        }
        
        key1 = ' ';
    }

}
