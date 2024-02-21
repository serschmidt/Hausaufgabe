package l26;

public class MainShape {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("red", 3),
                new Square("blue", 4),
                new Triangle("yellow", 5),
                new RectAngle("green", 2.5),
                new Raute("lila", 5),
                new Kite("rainbow", 7)
        };
        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println();
        }

    }
}
