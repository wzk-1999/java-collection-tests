package com.wzk.collection;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Set;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class Hash_2 {
    public static void main(String[] args) {
        Set hashSet=new HashSet();
        // Creating a MyDate object
        Employee_2.MyDate birthDate = new Employee_2.MyDate(1990, 5, 20);

        // Creating an Employee object
        hashSet.add(new Employee_2("John Doe", 50000, birthDate));


        // Creating an Employee object
        hashSet.add(new Employee_2("John Doe", 50000, birthDate));

        hashSet.add(new Employee_2("Doe", 50000, birthDate));
        hashSet.add(new Employee_2("Doe", 500, birthDate));

        // Printing the Employee object
        System.out.println(hashSet); // Employee{name='John Doe', sal=50000, birthday=1990-05-20}


    }
}

class Employee_2 {
    private String name;
    private Integer sal;
    private MyDate birthday;

    // Constructor
    public Employee_2(String name, Integer sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Integer getSal() {
        return sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_2 employee2 = (Employee_2) o;
        return Objects.equals(name, employee2.name) && Objects.equals(birthday, employee2.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    static class MyDate {
        private int year;
        private int month;
        private int day;

        // Constructor
        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        // Getters
        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }

        // Setters
        public void setYear(int year) {
            this.year = year;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public void setDay(int day) {
            this.day = day;
        }

        // toString method
        @Override
        public String toString() {
            return year + "-" + (month < 10 ? "0" : "") + month + "-" + (day < 10 ? "0" : "") + day;
        }

        // equals method
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MyDate myDate = (MyDate) o;

            if (year != myDate.year) return false;
            if (month != myDate.month) return false;
            return day == myDate.day;
        }

        // hashCode method
        @Override
        public int hashCode() {
            int result = year;
            result = 31 * result + month;
            result = 31 * result + day;
            return result;
        }
    }
}
