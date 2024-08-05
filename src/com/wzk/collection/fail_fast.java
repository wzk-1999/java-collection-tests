package com.wzk.collection;

import java.util.*;
import java.util.Iterator;

public class fail_fast {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

//        Collections
//        List
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            // Modifying the list during iteration
            list.add("D"); // This will cause a ConcurrentModificationException
        }
    }
}

