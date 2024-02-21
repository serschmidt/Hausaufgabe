package l18.animal;
import l18.people.*;

import java.util.Scanner;

public class Dog {
    String name;
    int age;

//    private final static int chromosomNumber;
//
//    static {
//        System.out.println("Задайте количество Хромозон собаки: ");
//        Scanner scanner = new Scanner(System.in);
//        chromosomNumber =  Integer.parseInt(scanner.nextLine());
//        scanner.close();
//    }
//
//    public static int getChromosomNumber()
//    {
//        return chromosomNumber;
//    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("Hund, " + this.name + ", " + age);
    }
}