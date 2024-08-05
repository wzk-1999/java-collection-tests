package com.wzk.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class Iterator {
    public static void main(String[] args) {
        Collection arrayList=new ArrayList();
        arrayList.add(new Book("aa","bb",8.8));
        arrayList.add(new Book("cc","dd",8.0));
        arrayList.add(new Book("ee","ff",9.8));
        arrayList.add("java");

        java.util.Iterator iterator=arrayList.iterator();
//        while (iterator.hasNext()){
//            Object next=iterator.next();
//            System.out.println(next);
//        }
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

//        iterator.next();
        // reset the iterator
        iterator=arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("second: "+next);
        }

        for(Object obj:arrayList){
            System.out.println("enhanced for loop: "+obj);
        }


    }
}

class Book{
    private String Name;
    private String Author;
    private double rate;

    public Book(String name, String author, double rate) {
        Name = name;
        Author = author;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                ", rate=" + rate +
                '}';
    }
}
