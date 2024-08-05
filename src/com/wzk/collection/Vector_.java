package com.wzk.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class Vector_ {

    public static void main(String[] args) {
        Set hashset=new HashSet();
        hashset.add(new String("aa"));
        hashset.add(new String("aa"));
        for (Object o :hashset) {
            System.out.println(o);
        }

    }

}
