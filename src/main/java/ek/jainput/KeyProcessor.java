package ek.jainput;


public class KeyProcessor
{
    private Callback cb;
    
    private char key1 = ' ';

    
    public static interface Callback
    {
        public void onText(String str);
    }
    
    
    public KeyProcessor(Callback cb)
    {
        this.cb = cb;
    }

    
    public void processChar(char ch)
    {
        switch(ch)
        {
        case 'a': do_a(); break;
        case 'i': do_i(); break;
        case 'u': do_u(); break;
        case 'e': do_e(); break;
        case 'o': do_o(); break;

        case 'A': do_A(); break;
        case 'I': do_I(); break;
        case 'U': do_U(); break;
        case 'E': do_E(); break;
        case 'O': do_O(); break;
        case '-': cb.onText("ー"); break;

        case 'k': key1 = ch; break;
        case 'K': key1 = Character.toLowerCase(ch); break;
        case 'g': key1 = ch; break;
        case 'G': key1 = Character.toLowerCase(ch); break;

        case 's': key1 = ch; break;
        case 'S': key1 = Character.toLowerCase(ch); break;
        case 'z': key1 = ch; break;
        case 'Z': key1 = Character.toLowerCase(ch); break;

        case 't': do_t(); break;
        case 'T': do_T(); break;
        case 'd': key1 = ch; break;
        case 'D': key1 = Character.toLowerCase(ch); break;

        case 'n': do_n(); break;
        case 'N': do_N(); break;
        case 'm': key1 = ch; break;
        case 'M': key1 = Character.toLowerCase(ch); break;
        
        case 'h': key1 = ch; break;
        case 'H': key1 = Character.toLowerCase(ch); break;
        case 'b': key1 = ch; break;
        case 'B': key1 = Character.toLowerCase(ch); break;
        case 'p': key1 = ch; break;
        case 'P': key1 = Character.toLowerCase(ch); break;

        case 'y': key1 = ch; break;
        case 'Y': key1 = Character.toLowerCase(ch); break;
        
        case 'r': key1 = ch; break;
        case 'R': key1 = Character.toLowerCase(ch); break;
        
        case 'w': key1 = ch; break;
        case 'W': key1 = Character.toLowerCase(ch); break;

        // Small
        case 'x': key1 = ch; break;
        case 'X': key1 = Character.toLowerCase(ch); break;
        }
    }

    
    private void do_n()
    {
        if(key1 == 'n') 
        {
            cb.onText("ん");
            key1 = ' ';
        }
        else
        {
            key1 = 'n';
        }
    }
    
    
    private void do_N()
    {
        if(key1 == 'n') 
        {
            cb.onText("ン");
            key1 = ' ';
        }
        else
        {
            key1 = 'n';
        }
    }
    

    private void do_t()
    {
        if(key1 == 'x') 
        {
            cb.onText("っ");
            key1 = ' ';
        }
        else
        {
            key1 = 't';
        }
    }
    
    
    private void do_T()
    {
        if(key1 == 'x') 
        {
            cb.onText("ッ");
            key1 = ' ';
        }
        else
        {
            key1 = 't';
        }
    }

    
    private void do_a()
    {
        switch(key1)
        {
        case ' ': cb.onText("あ"); break;
        
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
        case 'w': cb.onText("わ"); break;
        
        // Small
        case 'x': cb.onText("ゃ"); break;
        }
        
        key1 = ' ';
    }

    
    private void do_i()
    {
        switch(key1)
        {
        case ' ': cb.onText("い"); break;
        
        case 'k': cb.onText("き"); break;
        case 'g': cb.onText("ぎ"); break;
        
        case 's': cb.onText("し"); break;
        case 'z': cb.onText("じ"); break;
        
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

        // Small
        case 'x': cb.onText("ゅ"); break;
        }
        
        key1 = ' ';
    }

    
    private void do_e()
    {
        switch(key1)
        {
        case ' ': cb.onText("え"); break;
        
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
        case 'w': cb.onText("を"); break;
        
        // Small
        case 'x': cb.onText("ょ"); break;
        }
        
        key1 = ' ';
    }

    
    private void do_A()
    {
        switch(key1)
        {
        case ' ': cb.onText("ア"); break;
        
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
        
        // Small
        case 'x': cb.onText("ャ"); break;
        }
        
        key1 = ' ';
    }

    
    private void do_I()
    {
        switch(key1)
        {
        case ' ': cb.onText("イ"); break;
        
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
        
        // Small
        case 'x': cb.onText("ョ"); break;
        }
        
        key1 = ' ';
    }

}
