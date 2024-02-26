package l33.example;

class Box<T> {
    private T content;

    public void  set(T content) {
        this.content = content;
    }
    public T get() {
        return content;
    }
}

class Main{
    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>();
        stringBox.set("Hello");
        System.out.println(stringBox.get());

//        Box<int> intBox = new Box<int>();
//        stringBox.set(12324);
//        System.out.println(intBox.get());
    }
}