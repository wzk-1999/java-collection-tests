package com.wzk.exception;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class exception01 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        try {
            int res=num1/num2;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("continue");
    }
}
