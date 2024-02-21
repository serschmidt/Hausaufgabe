package l18.people;

import java.util.Scanner;

public class Woman{
    String name;
    int age;

    static private int chromosomNumberWoman;

    static {
        System.out.println("Задайте количество Хромозон у женщины: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumberWoman =  Integer.parseInt(scanner.nextLine());
        scanner.close();
    }

    static int getChromosomNumber()
    {
        return chromosomNumberWoman;
    }

    public Woman(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Woman, " + this.name + ", " + age + " и имеет: "+ this.getChromosomNumber() + " хромозонов";
    }
}