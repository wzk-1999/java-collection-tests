package com.wzk.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class List_ {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("aa");
        list.add(1,"ee");

        for (Object o :list) {
            System.out.println(o);
        }

        System.out.println(list.get(2));

    }
}
