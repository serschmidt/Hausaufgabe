package l17.people;

import java.util.Scanner;

public class Man {
    String name;
    int age;

    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
//        String s = this.getChromosomNumber() + " хромозонов";
        return ("Man, " + this.name + ", " + age );
    }
}