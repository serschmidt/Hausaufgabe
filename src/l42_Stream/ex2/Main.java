package l42_Stream.ex2;

public class Main {

    public static boolean isInt(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e)
        {
            return false;
//            System.out.println("неверно");
        }
    }


    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("произошла арифметическая ошибка");
        }

        String str = "5194";
        int zahl = -1;

        if (isInt(str)) {
            zahl = Integer.parseInt(str);
        }

        System.out.println(zahl);
    }
}
