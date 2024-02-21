import l17.people.*;
import l17.animal.*;
import l17.transport.*;

public class L17Main {
    public static void main(String[] args) {
        Man sergej = new Man("Sergej", 42);

//        String s = sergej.toString();         // оказывается тоже самое
//        System.out.println(s);

//Инициализация
        Woman anna = new Woman("Anna", 33);

        Man fritzi = new Man("Fritz", 9);

        Cat mietze = new Cat("Mietze", 3);

        Dog sharik = new Dog("Шарик", 5);

        Cow marta = new Cow("Марта", 10);

        Car passat = new Car("Passat", 4);

        Bike welo = new Bike("Велик", 7);

        Bus s55 = new Bus("Линия S55", 2);

        //

        System.out.println(sergej);
        System.out.println(anna);
        System.out.println(fritzi);
        System.out.println(mietze);
        System.out.println(sharik);
        System.out.println(marta);
        System.out.println(passat);
        System.out.println(welo);
        System.out.println(s55);


    }
}
