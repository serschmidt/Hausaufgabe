package l18.people;

import java.util.Scanner;

public class Man {
    String name;
    int age;

    private final static int chromosomNumberMan;

    static {
        System.out.println("Задайте количество Хромозон у мужчины: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumberMan =  Integer.parseInt(scanner.nextLine());
        scanner.close();
    }

    public static int getChromosomNumber()
    {
        return chromosomNumberMan;
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