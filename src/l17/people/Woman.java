package l17.people;

import java.util.Scanner;

public class Woman{
    String name;
    int age;

    public Woman(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Woman, " + this.name + ", " + age ;
    }
}