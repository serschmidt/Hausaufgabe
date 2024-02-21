import java.util.Scanner;

public class AgeCounter {
    public static void main(String[] args) {
        int birthYear;

        int actualYear = 2024; //Konstante

        String result = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш год рождения: \nGeben Sie ihr Geburtsjahr ein: ");
        birthYear = scanner.nextInt();

        int age = actualYear - birthYear;

        if (age > 150 | age <0){
            System.out.println("Nicht innerhalb der Lebenserwartung!");
            System.exit(-1);
        } else if (age <= 14) {
            result = "Ребёнок";
        } else if (age <= 18) {
            result = "Подросток";
        } else {
            result = (age <= 60) ? "Взрослый" : "Пожилой";
        }
        System.out.println("Вы: " + result);
    }
}
