package l17.animal;
import l17.people.*;

import java.util.Scanner;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("Katze, " + this.name + ", " + age);
    }
}
