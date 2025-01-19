package com.durga;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class DS_147_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("Karim B", 950);
        lhm.put("S Mane", 850);
        lhm.put("Robert L", 690);
        lhm.put("M Salah", 690);
// Insertion order preserved: {Karim B=950, S Mane=850, Robert L=690, M Salah=690}
        System.out.println(lhm);
//        hm.put("Robert L", 690);
//        hm.put("M Salah", 690);
        HashMap hm = new HashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        hm.put(i1, "Karim B");
        hm.put(i2, "S Mane");
        System.out.println(hm);  // {10=S Mane}

        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put(i1, "Karim B");
        ihm.put(i2, "S Mane");
        System.out.println(ihm);  // {10=Karim B, 10=S Mane}



// insertion order based on Hashcode / not preserved
        System.out.println(hm); //{S Mane=850, Karim B=950, M Salah=690, Robert L=690}


    }
}
