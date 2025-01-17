package com.wzk.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author zhankui wang
 * @version 1.0
 */
public class Question {
    public static void main(String[] args) {
        Set set =new HashSet();
        Person p1=new Person(1001,"AA");
        Person p2=new Person(1002,"BB");
        set.add(p1);
        set.add(p2);

        p1.name="CC";
        System.out.println(set);
        set.remove(p1);
        System.out.println(set);

        set.add(new Person(1001,"CC"));
        System.out.println(set);

        set.add(new Person(1001,"AA"));
        System.out.println(set);
    }
}

class Person{
    public Integer id;
    public String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
