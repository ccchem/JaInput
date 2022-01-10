package ek.jainput.proc;


public class HiraganaKeyProcessor implements KeyProcessor
{
    private Callback cb;
    
    private char key1 = ' ';

    
    /**
     * Constructor
     * @param cb callback interface implementation
     */
    public HiraganaKeyProcessor(Callback cb)
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
        case 'a': do_a(); break;
        case 'i': do_i(); break;
        case 'u': do_u(); break;
        case 'e': do_e(); break;
        case 'o': do_o(); break;

        case 'A': cb.onText("ぁ"); break;
        case 'Y': do_Y(); break;
        case 'U': do_U(); break;
        case 'O': do_O(); break;
        
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
        
        case 'w': cb.onText("わ"); break;
        case 'W': cb.onText("を"); break;
        
        case 'k': key1 = ch; break;
        case 'g': key1 = ch; break;

        case 's': key1 = ch; break;
        case 'z': key1 = ch; break;
        case 'j': key1 = ch; break;

        case 't': key1 = ch; break;
        case 'T': key1= ' '; cb.onText("っ"); break;
        case 'd': key1 = ch; break;

        case 'n': key1 = ch; break;
        case 'N': key1= ' '; cb.onText("ん"); break;
        case 'm': key1 = ch; break;
        
        case 'h': key1 = ch; break;
        case 'b': key1 = ch; break;
        case 'p': key1 = ch; break;

        case 'y': key1 = ch; break;
        
        case 'r': key1 = ch; break;
        }
    }
    
    private void do_a()
    {
        switch(key1)
        {
        case 'k': cb.onText("か"); break;
        case 'g': cb.onText("が"); break;
        
        case 's': cb.onText("さ"); break;
        case 'z': cb.onText("ざ"); break;
        
        case 't': cb.onText("た"); break;
        case 'd': cb.onText("だ"); break;
        
        case 'n': cb.onText("な"); break;
        case 'm': cb.onText("ま"); break;

        case 'h': cb.onText("は"); break;
        case 'b': cb.onText("ば"); break;
        case 'p': cb.onText("ぱ"); break;

        case 'y': cb.onText("や"); break;
        case 'r': cb.onText("ら"); break;
        }
        
        key1 = ' ';
    }

    private void do_Y()
    {
        switch(key1)
        {
        case 'k': cb.onText("きゃ"); break;
        
        case 's': cb.onText("しゃ"); break;
        case 'j': cb.onText("じゃ"); break;
        
        case 'r': cb.onText("りゃ"); break;
        
        case ' ': cb.onText("ゃ"); break;
        }
        
        key1 = ' ';
    }
    
    private void do_i()
    {
        switch(key1)
        {
        case ' ': cb.onText("い"); break;
        case 'q': cb.onText("ぃ"); break;    // Small
        
        case 'k': cb.onText("き"); break;
        case 'g': cb.onText("ぎ"); break;
        
        case 's': cb.onText("し"); break;
        case 'j': cb.onText("じ"); break;
        
        case 't': cb.onText("ち"); break;
        case 'd': cb.onText("ぢ"); break;
        
        case 'n': cb.onText("に"); break;
        case 'm': cb.onText("み"); break;

        case 'h': cb.onText("ひ"); break;
        case 'b': cb.onText("び"); break;
        case 'p': cb.onText("ぴ"); break;

        case 'r': cb.onText("り"); break;
        }
        
        key1 = ' ';
    }

    
    private void do_u()
    {
        switch(key1)
        {
        case ' ': cb.onText("う"); break;
        case 'q': cb.onText("ぅ"); break;    // Small

        case 'k': cb.onText("く"); break;
        case 'g': cb.onText("ぐ"); break;
        
        case 's': cb.onText("す"); break;
        case 'z': cb.onText("ず"); break;
        
        case 't': cb.onText("つ"); break;
        case 'd': cb.onText("づ"); break;
        
        case 'n': cb.onText("ぬ"); break;
        case 'm': cb.onText("む"); break;

        case 'h': cb.onText("ふ"); break;
        case 'b': cb.onText("ぶ"); break;
        case 'p': cb.onText("ぷ"); break;

        case 'y': cb.onText("ゆ"); break;
        case 'r': cb.onText("る"); break;
        }
        
        key1 = ' ';
    }

    private void do_U()
    {
        switch(key1)
        {
        case 'k': cb.onText("きゅ"); break;
        
        case 's': cb.onText("しゅ"); break;
        case 'j': cb.onText("じゅ"); break;
        
        case 'r': cb.onText("りゅ"); break;        
        
        case ' ': cb.onText("ゅ"); break;
        }
        
        key1 = ' ';
    }

    
    private void do_e()
    {
        switch(key1)
        {
        case ' ': cb.onText("え"); break;
        case 'q': cb.onText("ぇ"); break;    // Small

        case 'k': cb.onText("け"); break;
        case 'g': cb.onText("げ"); break;
        
        case 's': cb.onText("せ"); break;
        case 'z': cb.onText("ぜ"); break;
        
        case 't': cb.onText("て"); break;
        case 'd': cb.onText("で"); break;
        
        case 'n': cb.onText("ね"); break;
        case 'm': cb.onText("め"); break;

        case 'h': cb.onText("へ"); break;
        case 'b': cb.onText("べ"); break;
        case 'p': cb.onText("ぺ"); break;

        case 'r': cb.onText("れ"); break;
        }
        
        key1 = ' ';
    }

    
    private void do_o()
    {
        switch(key1)
        {
        case ' ': cb.onText("お"); break;
        case 'q': cb.onText("ぉ"); break;    // Small

        case 'k': cb.onText("こ"); break;
        case 'g': cb.onText("ご"); break;
        
        case 's': cb.onText("そ"); break;
        case 'z': cb.onText("ぞ"); break;
        
        case 't': cb.onText("と"); break;
        case 'd': cb.onText("ど"); break;
        
        case 'n': cb.onText("の"); break;
        case 'm': cb.onText("も"); break;

        case 'h': cb.onText("ほ"); break;
        case 'b': cb.onText("ぼ"); break;
        case 'p': cb.onText("ぽ"); break;

        case 'y': cb.onText("よ"); break;
        case 'r': cb.onText("ろ"); break;
        }
        
        key1 = ' ';
    }
    
    
    private void do_O()
    {
        switch(key1)
        {
        case 'k': cb.onText("きょ"); break;

        case 's': cb.onText("しょ"); break;
        case 'j': cb.onText("じょ"); break;
        
        case 'r': cb.onText("りょ"); break;
        
        case ' ': cb.onText("ょ"); break;
        }
        
        key1 = ' ';
    }

}
