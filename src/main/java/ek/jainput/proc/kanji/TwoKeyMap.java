package ek.jainput.proc.kanji;

import ek.jainput.proc.kanji.k2.BoxesKMap;
import ek.jainput.proc.kanji.k2.HLinesKMap;
import ek.jainput.proc.kanji.k2.HitoKMap;
import ek.jainput.proc.kanji.k2.KiKMap;
import ek.jainput.proc.kanji.k2.OokiKMap;
import ek.jainput.proc.kanji.k2.ShapesKMap;
import ek.jainput.proc.kanji.k2.TakeKMap;
import ek.jainput.proc.kanji.k2.TsuchiKMap;
import ek.jainput.proc.kanji.k2.VLinesKMap;

public class TwoKeyMap
{
    private SecondKeyMap[] keyMap = new SecondKeyMap[128];

    public TwoKeyMap()
    {
        initKeyMap();
    }
    
    public SecondKeyMap get(char ch)
    {
        return keyMap[ch];
    }
    
    
    private void initKeyMap()
    {
        //
        addKeyMap(new ShapesKMap());
        //
        addKeyMap(new HLinesKMap());
        // 中
        addKeyMap(new VLinesKMap());        
        // 人
        addKeyMap(new HitoKMap());
        // 金
        //addKey1Map(new KaneProc());
        // 日, 目, 皿
        addKeyMap(new BoxesKMap());
        // 土
        addKeyMap(new TsuchiKMap());
        // 大
        addKeyMap(new OokiKMap());
        // 木
        addKeyMap(new KiKMap());
        // 竹
        addKeyMap(new TakeKMap());
        // 厶
        //addKey1Map(new N4Proc());
    }
    
    
    private void addKeyMap(SecondKeyMap kp)
    {
        keyMap[kp.getKey1()] = kp;
    }

}
