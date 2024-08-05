package com.wzk.map;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet treeSet=new java.util.TreeSet();
        treeSet.add(new Person());
    }
}

class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
