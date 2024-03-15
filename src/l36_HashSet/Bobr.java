package l36_HashSet;

public class Bobr implements Comparable<Bobr>{

    //Инициализируем переменные бобра:
    String name;
    int age;
    int relativeCount;

    //Конструктор для создания Бобра:
    public Bobr(String name, int age, int relativeCount) {
        this.name = name;
        this.age = age;
        this.relativeCount = relativeCount;
    }

    @Override
    public String toString() {
        return "Имя " + this.name + ", Возраст: " + this.age + " (" + this.relativeCount + ") \n";
    }

    @Override
    public int compareTo(Bobr bobr) {
        if (this.age < bobr.age) {
            return -1;
        } else if (this.age > bobr.age) {
            return 1;
        } else {
            return 0;
        }
    }


}
