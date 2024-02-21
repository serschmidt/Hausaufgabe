package l17.transport;

class BMWAutoFabric {
    String vendor;
    public static int totalCarNumber = 0;
    public Car buildCar() {
        BMWAutoFabric.totalCarNumber ++;
        return new Car("bmw", 2);
    }
}
//
//public class Main {
//    public static void main(String[] args) {
//        BMWAutoFabric bmwAutoFabricMunich = new BMWAutoFabric();
//        BMWAutoFabric bmwAutoFabricBerlin = new BMWAutoFabric();
//        BMWAutoFabric bmwAutoFabricHamburg = new BMWAutoFabric();
//
//
//
//    }
//
//}
