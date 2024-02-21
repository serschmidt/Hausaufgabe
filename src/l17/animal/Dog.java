package l17.animal;
import l17.people.*;

import java.util.Scanner;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("Hund, " + this.name + ", " + age);
    }
}