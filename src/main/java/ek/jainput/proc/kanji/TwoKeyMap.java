package ek.jainput.proc.kanji;

import ek.jainput.proc.kanji.k2.Num_1_Map;
import ek.jainput.proc.kanji.k2.J_Map;
import ek.jainput.proc.kanji.k2.K_Map;
import ek.jainput.proc.kanji.k2.M_Map;
import ek.jainput.proc.kanji.k2.Num_0_Map;
import ek.jainput.proc.kanji.k2.N_Map;
import ek.jainput.proc.kanji.k2.O2_Map;
import ek.jainput.proc.kanji.k2.O_Map;
import ek.jainput.proc.kanji.k2.P_Map;
import ek.jainput.proc.kanji.k2.Q2_Map;
import ek.jainput.proc.kanji.k2.Q_Map;
import ek.jainput.proc.kanji.k2.RB_Map;
import ek.jainput.proc.kanji.k2.R_Map;
import ek.jainput.proc.kanji.k2.S_Map;
import ek.jainput.proc.kanji.k2.Slash_Map;
import ek.jainput.proc.kanji.k2.T_Map;
import ek.jainput.proc.kanji.k2.LB_Map;
import ek.jainput.proc.kanji.k2.L_Map;
import ek.jainput.proc.kanji.k2.W_Map;
import ek.jainput.proc.kanji.k2.X_Map;
import ek.jainput.proc.kanji.k2.Y_Map;
import ek.jainput.proc.kanji.k2.A_Map;
import ek.jainput.proc.kanji.k2.B2_Map;
import ek.jainput.proc.kanji.k2.A2_Map;
import ek.jainput.proc.kanji.k2.B_Map;
import ek.jainput.proc.kanji.k2.C_Map;
import ek.jainput.proc.kanji.k2.D_Map;
import ek.jainput.proc.kanji.k2.E_Map;
import ek.jainput.proc.kanji.k2.F_Map;
import ek.jainput.proc.kanji.k2.G_Map;
import ek.jainput.proc.kanji.k2.H_Map;
import ek.jainput.proc.kanji.k2.I_Map;
import ek.jainput.proc.kanji.k2.J2_Map;
import ek.jainput.proc.kanji.k2.Num_2_Map;
import ek.jainput.proc.kanji.k2.Num_3_Map;


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
        addKeyMap(new LB_Map());
        addKeyMap(new RB_Map());
        addKeyMap(new Slash_Map());

        // Numbers
        addKeyMap(new Num_0_Map());
        addKeyMap(new Num_1_Map());
        addKeyMap(new Num_2_Map());
        addKeyMap(new Num_3_Map());
        
        addKeyMap(new A_Map());
        addKeyMap(new A2_Map());
        
        addKeyMap(new B_Map());
        addKeyMap(new B2_Map());
        
        addKeyMap(new C_Map());
        
        addKeyMap(new D_Map());
        addKeyMap(new E_Map());
        addKeyMap(new F_Map());
        addKeyMap(new G_Map());

        addKeyMap(new H_Map());
        addKeyMap(new I_Map());
        addKeyMap(new J_Map());
        addKeyMap(new J2_Map());
        addKeyMap(new K_Map());
        addKeyMap(new L_Map());

        addKeyMap(new M_Map());
        addKeyMap(new N_Map());
        
        addKeyMap(new O_Map());
        addKeyMap(new O2_Map());

        addKeyMap(new P_Map());
        addKeyMap(new Q_Map());
        addKeyMap(new Q2_Map());

        addKeyMap(new R_Map());
        addKeyMap(new S_Map());
        addKeyMap(new T_Map());

        addKeyMap(new W_Map());
        addKeyMap(new X_Map());
        addKeyMap(new Y_Map());
    }
    
    
    private void addKeyMap(SecondKeyMap kp)
    {
        keyMap[kp.getKey1()] = kp;
    }

}
