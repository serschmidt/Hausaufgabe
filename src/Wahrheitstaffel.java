import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Wahrheitstaffel {
    public static void main(String[] args) {

        boolean needAnd, needOr, needNot;
        needAnd = needOr = needNot= false;

        int i,j;

        if (args.length > 3 ) {
            System.out.println("unzureichende Argumente");
            System.exit(-1);
        }

        if (args.length ==0 ){
            needAnd = needOr = needNot = true;
        }

        for (i = 0 ; i < args.length; i++){
            if (args[i].equals("and")) {
                needAnd = true;
            } else if (args[i].equals("or")) {
                needOr = true;
            } else if (args[i].equals("not")) {
                needNot = true;
            } else {
                System.out.println("unzureichende Argumente");
                System.exit(-1);
            }

        }
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String header = "| ";
        String underLine = "--";

        for (i = 1; i<= size; i++){
            header += "x" + i + " | ";
            underLine += "-----";
        }

        if (needAnd) {
            header += "AND | ";
            underLine += "-----";
        }
        if (needOr) {
            header += " OR | ";
            underLine += "-----";
        }
        if (needNot) {
            header += "NOT | ";
            underLine += "-----";
        }
        String s  ="";
        System.out.println(header);
//        System.out.println(underLine);
        int l = header.length();
//        System.out.println(l);

// weitere Möglichkeit des Unterstrichs

        for (i=1; i<l; i++){
            s = s + "-";}
            System.out.println(s);

        for (j = 0; j <= size*size; j++){
            for (i = 1; i<=size; i++) {
                System.out.print("  1  ");
            }
            System.out.println("\n" +s);
        }
    }
}


//  1. Передать исходные данные как Аргумент при запуске
//  2. Наш входящий аргумент извлечь из массива аргументов.
//  3. Переобразовать строковое значение аргумента в численное. "12" -> 12 String -> double
//  4. посчитать Косинус данного числа.
//  5. вывести ответ в консоль.

//  2 способа сравнения:
//  1. ==
//  2. метод equals   string1.equals(string2)
