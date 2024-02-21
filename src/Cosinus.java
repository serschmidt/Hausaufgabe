import static java.lang.Math.*;

public class Cosinus {
    public static void main(String[] args) {

        double grad = Double.parseDouble(args[0]);  //Берётся первый Аргумент в строке
        double pi = 3.1415926535;       //полный круг в радиальной системе: 2*pi
                                        //полный круг в градусной системе: 360
        double x;
        x = grad * 2*pi / 360;        //Угол 'x' в радиальной системе

        double cosX;
        cosX = cos(x);
        System.out.println(cosX);

    }
}
