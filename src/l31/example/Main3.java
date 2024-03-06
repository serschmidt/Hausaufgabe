package l31.example;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}


class Main30 {
    public static void main(String[] args) {
        Calculator add = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int result = add.operate(2, 2);
        System.out.println("2 + 2 = " + result);


        Calculator minus = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
        int result2 = minus.operate(3, 2);
        System.out.println("3 - 2 = " + result2);

    }
}


class Main3 {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> {
            return  a - b;                  //analoge Schreibweise
        };
        Calculator multipicate = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;


        System.out.println("Сумма 5 и 3 равна " + add.operate(5, 3));
        System.out.println("Разность 5 и 3 равна " + subtract.operate(5, 3));
        System.out.println("Продукт 5 и 3 равна " + multipicate.operate(5, 3));
        System.out.println("Целое Число Дивизии 15 и 3 равна " + division.operate(15, 3));
    }
}