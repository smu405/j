/*
 * @author jsl
 * @since 20170313 20160302
 */

package com.sd.sort.v1;
//import java.util.Arrays;

public class Weight implements Comparable {
    private int kilo;
    public Weight(int k) {
        kilo=k;
    }
    public int compareTo(Object o) {
        Weight w=(Weight)o;
        return this.kilo-w.kilo;
    }
    public String toString() {
        String msg=kilo+"";
        return msg;
    }
}

