package l31.example;

interface Greeting {
    void sayHello();

    void sayGoodBye();

}

class MyGreeting implements Greeting{
    @Override
    public void sayHello() {
        System.out.println("Привет из обычного класса");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("Пока из обычного класса");
    }

}

class Main1 {
    public static void main(String[] args) {

        MyGreeting myGreeting = new MyGreeting();
        myGreeting.sayHello();

        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }
            @Override
            public void sayGoodBye() {
                System.out.println("Пока из анонимного класса!");
            }
        };

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здравствуйте!");
            }
            @Override
            public void sayGoodBye() {
                System.out.println("До свиданья!");
            }
        };

        Greeting greeting3 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Приветсвую!");
            }
            @Override
            public void sayGoodBye() {
                System.out.println("До скорой встречи!");
            }
        };

        greeting1.sayHello();
        greeting1.sayGoodBye();
        greeting2.sayHello();
        greeting2.sayGoodBye();
        greeting3.sayHello();
        greeting3.sayGoodBye();
    }
}