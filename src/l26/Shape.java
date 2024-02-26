package l26;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;     //Setter for Color
    }

    abstract double getArea();  //abstract method for Area

    abstract double getPerimeter(); // abstract methode for perimeter

    // output information of the given shape
    public void printInfo() {
        System.out.println("Цвет: " + color);
        System.out.println("плошадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }

}


class Circle extends Shape {

    private double radius;

    //Construct Circle
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

}
class Square extends Shape {

    private double side;

    //Construct Square
    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
}

class RectAngle extends Shape {

    private double shortSide;
    private double longSide;

    //Construct Square
//    public RectAngle(String color, double shortSide, double longSide) {
    public RectAngle(String color, double shortSide) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = 2 * shortSide;
    }

    @Override
    public double getArea() {
        return this.shortSide * this.longSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.shortSide * this.longSide;
    }
}

class Triangle extends Shape {

    private double side;

    //Construct Triangle
    public Triangle(String color, double side) {
        super(color);
        this.side = side;
    }

    //Triangle area = 1/2 g*h  // g = a; // Pytagoras: a^2 = (a/2)^2 + h^2
                                            // h^2 = a^2 - a^2/4 = a^2(1-1/4) = (a/2)^2 * 3
    //         area = 1/2 * a * a/2 * sqrt(3)
    @Override
    public double getArea() {
        return this.side * this.side / 4 * Math.sqrt(3);
    }

    @Override
    public double getPerimeter() {
        return 3 * this.side;
    }

}
class Raute extends Shape {

    private double side;
    private double angle;

    //Construct Square
//    public Square(String color, double side, double angle) {
    public Raute(String color, double side) {
        super(color);
        this.side = side;
        this.angle = 60;
    }

    @Override
    public double getArea() {
        return this.side * ( this.side * Math.sin(this.angle * Math.PI / 360) );
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
}

class Kite extends Shape {

    private double side;

    //Construct Square
    public Kite(String color, double side) {
        super(color);
        this.side = side;
    }

    //два триугльника по: А=1/2 g*h // g=3*side, h=side;
    @Override
    public double getArea() {
        return this.side * ( this.side * 3);
    }

    //Hypothenuse: a^2=x^2+x^2 = x^2 * 2 // b^2=x^2+(2*x)^2 = x^2 * 5
    @Override
    public double getPerimeter() {
        return 2 * this.side * (Math.sqrt(2) + Math.sqrt(5));
    }
}
