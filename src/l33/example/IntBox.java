package l33.example;

class IntBox {
    private int content;

    public void set(int content) {
        this.content = content;
    }
    public int get() {
        return content;
    }
}

class Main01{
    public static void main(String[] args) {
        IntBox intBox = new IntBox();

        intBox.set(123);

        System.out.println(intBox.get());

    }
}