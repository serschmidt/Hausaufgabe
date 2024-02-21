package l25.animal;

import java.util.Scanner;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    //@Override
    public void makeSound(){
        System.out.println("Meow");
    }

    public String toString() {
        return ("Katze, " + this.name + ", " + age);
    }
}

// @Override
// .makeSound()
// .jump()
// .tailSize