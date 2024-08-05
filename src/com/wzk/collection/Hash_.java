package com.wzk.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class Hash_ {
    public static void main(String[] args) {
        Set hashset=new HashSet();
        hashset.add(new Employee("aa",18));
        hashset.add(new Employee("aa",18));
        hashset.add(new Employee("bb",19));

        System.out.println(hashset);
    }
}

class Employee{
    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
