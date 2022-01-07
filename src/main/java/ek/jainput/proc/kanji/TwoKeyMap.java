package ek.jainput.proc.kanji;

import ek.jainput.proc.kanji.box.A_Map;
import ek.jainput.proc.kanji.box.B_Map;
import ek.jainput.proc.kanji.box.W_Map;
import ek.jainput.proc.kanji.k2.Hito_Map;
import ek.jainput.proc.kanji.k2.K_Map;
import ek.jainput.proc.kanji.k2.M_Map;
import ek.jainput.proc.kanji.k2.N7_Map;
import ek.jainput.proc.kanji.k2.O_Map;
import ek.jainput.proc.kanji.k2.R_Map;
import ek.jainput.proc.kanji.k2.S_Map;
import ek.jainput.proc.kanji.k2.Shapes_Map;
import ek.jainput.proc.kanji.k2.X_Map;
import ek.jainput.proc.kanji.k2.C_Map;
import ek.jainput.proc.kanji.k2.H_Map;
import ek.jainput.proc.kanji.lines.E_Map;
import ek.jainput.proc.kanji.lines.HLines_Map;
import ek.jainput.proc.kanji.lines.J_Map;
import ek.jainput.proc.kanji.lines.G_Map;
import ek.jainput.proc.kanji.lines.VLines_Map;

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
        addKeyMap(new Shapes_Map());

        // Lines
        addKeyMap(new HLines_Map());
        addKeyMap(new VLines_Map());
        
        // 1 = 人
        addKeyMap(new Hito_Map());

        addKeyMap(new A_Map());
        addKeyMap(new B_Map());
        addKeyMap(new C_Map());
        addKeyMap(new E_Map());
        addKeyMap(new G_Map());

        addKeyMap(new H_Map());
        addKeyMap(new J_Map());
        addKeyMap(new K_Map());

        addKeyMap(new M_Map());

        addKeyMap(new O_Map());
        addKeyMap(new R_Map());
        addKeyMap(new S_Map());

        addKeyMap(new W_Map());
        addKeyMap(new X_Map());

        
        // 厶
        //addKey1Map(new N4Proc());
        
        
        addKeyMap(new N7_Map());
    }
    
    
    private void addKeyMap(SecondKeyMap kp)
    {
        keyMap[kp.getKey1()] = kp;
    }

}
