package l26;

abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();

    public String toString() {
        return ("Katze, " + this.name + ", " + age);
    }

}
