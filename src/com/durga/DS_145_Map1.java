package com.durga;

import java.util.*;

public class DS_145_Map1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Karim B", 950);
        hm.put("S Mane", 850);
        hm.put("Robert L", 690);
        hm.put("M Salah", 690);
// printing HashMap: {S Mane=850, Karim B=950, M Salah=690, Robert L=690}
        System.out.println(hm);
// updates the value but returns old value as well
        System.out.println(hm.put("Robert L", 696));  // 690
// updated HashMap Entries: {S Mane=850, Karim B=950, M Salah=690, Robert L=696}
        System.out.println(hm);
// Set of keys: [S Mane, Karim B, M Salah, Robert L]
        Set s = hm.keySet();
        System.out.println(s);  //note the bracket difference
// Collection of keys/values
        Collection ck = hm.keySet(); //[S Mane, Karim B, M Salah, Robert L]
        System.out.println(ck);
        Collection cv = hm.values();
        System.out.println(cv); //[850, 950, 690, 696]
// Set of Entry objects: [S Mane=850, Karim B=950, M Salah=690, Robert L=696]
        Set es = hm.entrySet();
        System.out.println(es);
// Use of Entry objects & cursor
        Iterator itr = es.iterator();
        while (itr.hasNext()) {
            Map.Entry hm1 = (Map.Entry) itr.next();
            System.out.println(hm1.getKey() + ".." + hm1.getValue());
            if (hm1.getKey().equals("M Salah")) {
                hm1.setValue(780);
            }
        }
        System.out.println(hm); //{S Mane=850, Karim B=950, M Salah=780, Robert L=696}
    }
}

//        Object put(Object key, Object value)
//        void putAll(Map m)
//        Object get(Object key)
//        Object remove(Object key)
//        boolean containsKey(Object key)
//        boolean containsValue(Object value)
//        boolean isEmpty()
//        int size()
//        void clear()