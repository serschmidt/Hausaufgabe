package l25;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Make some noise: ");
    }

    public String toString() {
        return ("Katze, " + this.name + ", " + age);
    }

}
