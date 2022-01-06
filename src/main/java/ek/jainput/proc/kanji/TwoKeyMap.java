package ek.jainput.proc.kanji;

import ek.jainput.proc.kanji.box.BoxesAKMap;
import ek.jainput.proc.kanji.box.BoxesBKMap;
import ek.jainput.proc.kanji.box.BoxesWKMap;
import ek.jainput.proc.kanji.k2.HitoKMap;
import ek.jainput.proc.kanji.k2.KiKMap;
import ek.jainput.proc.kanji.k2.N7KMap;
import ek.jainput.proc.kanji.k2.OokiKMap;
import ek.jainput.proc.kanji.k2.RoKMap;
import ek.jainput.proc.kanji.k2.ShapesKMap;
import ek.jainput.proc.kanji.k2.TakeKMap;
import ek.jainput.proc.kanji.lines.EKMap;
import ek.jainput.proc.kanji.lines.HLinesKMap;
import ek.jainput.proc.kanji.lines.JKMap;
import ek.jainput.proc.kanji.lines.TsuchiKMap;
import ek.jainput.proc.kanji.lines.VLinesKMap;
import ek.jainput.proc.kanji.lines.XKMap;

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
        // [ = 厂, 冂
        addKeyMap(new ShapesKMap());

        // Lines
        addKeyMap(new HLinesKMap());
        addKeyMap(new VLinesKMap());
        addKeyMap(new XKMap());
        addKeyMap(new EKMap());
        addKeyMap(new JKMap());
        
        // 1 = 人
        addKeyMap(new HitoKMap());
        // 金
        //addKey1Map(new KaneProc());
        
        // 日, 目, 皿
        addKeyMap(new BoxesAKMap());
        addKeyMap(new BoxesBKMap());
        addKeyMap(new BoxesWKMap());

        // g = 土
        addKeyMap(new TsuchiKMap());
        // o = 大
        addKeyMap(new OokiKMap());
        // k = 木
        addKeyMap(new KiKMap());
        // h = 竹
        addKeyMap(new TakeKMap());
        // 厶
        //addKey1Map(new N4Proc());
        
        // r =
        addKeyMap(new RoKMap());
        
        addKeyMap(new N7KMap());
    }
    
    
    private void addKeyMap(SecondKeyMap kp)
    {
        keyMap[kp.getKey1()] = kp;
    }

}
