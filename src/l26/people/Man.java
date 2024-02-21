package l26.people;

import l26.Person;

import java.util.Scanner;

public class Man extends Person {
    String name;
    int age;

    private final static int chromosomNumber;

    static {
        System.out.println("Задайте количество Хромозон: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber =  Integer.parseInt(scanner.nextLine());
        scanner.close();
    }

    public static int getChromosomNumber()
    {
        return chromosomNumber;
    }

    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
//        String s = this.getChromosomNumber() + " хромозонов";
        return ("Man, " + this.name + ", " + age + " и имеет: "+ this.getChromosomNumber() + " хромозонов");
    }
}