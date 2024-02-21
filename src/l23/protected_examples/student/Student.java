package l23.protected_examples.student;
//package l23.protected_examples.person.Person;

import l23.protected_examples.person.Person;
public class Student extends Person {
    String name;
    int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
        //super(name, age)
    }


}
