package l42_Stream.ex2;

class Main11 {
    public static void checkAge(int age) {
        if (age < 18 ) {
            throw new ArithmeticException("доступ запрещён - вам ");
        } else {
            System.out.println("Доступ разрешён");
        }
    }

    public static void main(String[] args) {

        int age = 14;

        checkAge(14);

    }
}
