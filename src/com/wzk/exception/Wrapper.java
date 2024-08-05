package com.wzk.exception;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class Wrapper {

    public static void main(String[] args) {
//        int a=100;
//        Integer b=a;
//        int c=b;
//        Object obj1=true?new Integer(1):new Double(2.000);
//        System.out.println(obj1);

        Object obj2;
        if(true)
            obj2=new Integer(1);
        else
            obj2=new Double(2.0);
        System.out.println(obj2);
        Integer integer1=new Integer(128);
        Integer integer2=new Integer(128);
        System.out.println(integer1==integer2);

        Integer integer3=1;
        Integer integer4=1;

        System.out.println(integer3==integer4);

        Integer integer5=128;
        int integer6=128;
        System.out.println(integer6==integer5);

        Integer aa=null;

        String a="jack";
        String b="jabk";
        System.out.println(a.compareTo(b));

//        StringBuffer
    }

}
