package com.wzk.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class HashMap_ {
    public static void main(String[] args) {
//        Map map=new HashMap();
//        map.put("n1","aa");
//        map.put("n2","ba");
//        map.put("n2","cc");
//
//        System.out.println(map.get("n5"));
        Map map=new HashMap();
        map.put(1,new Employee("aa",12.0,1));
        map.put(2,new Employee("bb",19.0,3));
        map.put(3,new Employee("cc",17.0,5));

        Set set = map.keySet();
        for (Object o :set) {
            Employee employee= (Employee)map.get(o);
            if (employee.getWage()>15){
                System.out.println(employee);
            }
        }

        Set set1 = map.entrySet();
        Iterator iterator=set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry next =  (Map.Entry)iterator.next();
            Employee employee=(Employee)next.getValue();
            if (employee.getWage()>15){
                System.out.println(employee+" entrySet method");
            }
        }


    }
}

class Employee{
    private String name;
    private Double wage;
    private Integer id;

    public Employee(String name, Double wage, Integer id) {
        this.name = name;
        this.wage = wage;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", wage=" + wage +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
