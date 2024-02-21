package l22;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("Katze, " + this.name + ", " + age);
    }

}
