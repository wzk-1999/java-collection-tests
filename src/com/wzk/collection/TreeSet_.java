package com.wzk.collection;

import java.util.Comparator;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class TreeSet_ {
    public static void main(String[] args) {
//        Set treeSet = new TreeSet(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return ((String) o1).compareTo((String) o2);
//            }
//        });

//        Properties

        Set treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() -((String) o2).length();
            }
        });

        treeSet.add("aa");
        treeSet.add("ab");
        treeSet.add("aac");
        treeSet.add("ba");
        treeSet.add("bacc");

        System.out.println(treeSet);

    }
}
