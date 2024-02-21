package l25.animal;
import l25.people.*;

import java.util.Scanner;

class Cow {
    String name;
    int age;

    public Cow(String name, int age){
        this.name = name;
        this.age = age;
    }

    //@Override
    public void makeSound(){
        System.out.println("Muhh");
    }

    public String toString() {
        return ("Kuh, " + this.name + ", " + age);
    }
}