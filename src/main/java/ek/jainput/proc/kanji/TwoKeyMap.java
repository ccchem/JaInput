package ek.jainput.proc.kanji;

import ek.jainput.proc.kanji.k2.Hito_Map;
import ek.jainput.proc.kanji.k2.J_Map;
import ek.jainput.proc.kanji.k2.K_Map;
import ek.jainput.proc.kanji.k2.M_Map;
import ek.jainput.proc.kanji.k2.N7_Map;
import ek.jainput.proc.kanji.k2.N_Map;
import ek.jainput.proc.kanji.k2.O_Map;
import ek.jainput.proc.kanji.k2.P_Map;
import ek.jainput.proc.kanji.k2.R_Map;
import ek.jainput.proc.kanji.k2.S_Map;
import ek.jainput.proc.kanji.k2.T_Map;
import ek.jainput.proc.kanji.k2.LB_Map;
import ek.jainput.proc.kanji.k2.V_Map;
import ek.jainput.proc.kanji.k2.W_Map;
import ek.jainput.proc.kanji.k2.X_Map;
import ek.jainput.proc.kanji.k2.A_Map;
import ek.jainput.proc.kanji.k2.B_Map;
import ek.jainput.proc.kanji.k2.C_Map;
import ek.jainput.proc.kanji.k2.E_Map;
import ek.jainput.proc.kanji.k2.F_Map;
import ek.jainput.proc.kanji.k2.G_Map;
import ek.jainput.proc.kanji.k2.H_Map;
import ek.jainput.proc.kanji.k2.Hito2_Map;
import ek.jainput.proc.kanji.lines.HLines_Map;
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
        addKeyMap(new LB_Map());

        // Lines
        addKeyMap(new HLines_Map());
        addKeyMap(new VLines_Map());
        
        addKeyMap(new Hito_Map());
        addKeyMap(new Hito2_Map());

        addKeyMap(new A_Map());
        addKeyMap(new B_Map());
        addKeyMap(new C_Map());
        addKeyMap(new E_Map());
        addKeyMap(new F_Map());
        addKeyMap(new G_Map());

        addKeyMap(new H_Map());
        addKeyMap(new J_Map());
        addKeyMap(new K_Map());

        addKeyMap(new M_Map());
        addKeyMap(new N_Map());
        
        addKeyMap(new O_Map());
        addKeyMap(new P_Map());

        addKeyMap(new R_Map());
        addKeyMap(new S_Map());
        addKeyMap(new T_Map());

        addKeyMap(new V_Map());
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
