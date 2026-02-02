public class AbstractFactoryDemoExamCar {
    public static void main(String[] args) {

        CarFactory usaFactory = new UsaCarFactory();
        CarFactory asiaFactory = new AsiaCarFactory();

        Car usaLuxury = usaFactory.createLuxuryCar();
        usaLuxury.showSpecification();

        Car usaSmall = usaFactory.createSmallCar();
        usaSmall.showSpecification();

        Car usaSedan = usaFactory.createSedanCar();
        usaSedan.showSpecification();

        Car asiaSmall = asiaFactory.createSmallCar();
        asiaSmall.showSpecification();

        Car asiaLuxury = asiaFactory.createLuxuryCar();
        asiaLuxury.showSpecification();

        Car asiaSedan = asiaFactory.createSedanCar();
        asiaSedan.showSpecification();

    }
}

interface Car {
    void showSpecification();
}

class SmallCar implements Car {

    private String engine;
    private String color;
    private String fuelType;

    public SmallCar(String engine, String color, String fuelType) {
        this.engine = engine;
        this.color = color;
        this.fuelType = fuelType;
    }

    public void showSpecification() {
        System.out.println("Small Car | Engine: " + engine +
                " | Color: " + color +
                " | Fuel: " + fuelType);
    }
}

class SedanCar implements Car {

    private String engine;
    private String color;
    private String fuelType;

    public SedanCar(String engine, String color, String fuelType) {
        this.engine = engine;
        this.color = color;
        this.fuelType = fuelType;
    }

    public void showSpecification() {
        System.out.println("Sedan Car | Engine: " + engine +
                " | Color: " + color +
                " | Fuel: " + fuelType);
    }
}
class LuxuryCar implements Car {

    private String engine;
    private String color;
    private String fuelType;

    public LuxuryCar(String engine, String color, String fuelType) {
        this.engine = engine;
        this.color = color;
        this.fuelType = fuelType;
    }

    public void showSpecification() {
        System.out.println("Luxury Car | Engine: " + engine +
                " | Color: " + color +
                " | Fuel: " + fuelType);
    }
}
interface CarFactory {
    Car createSmallCar();
    Car createSedanCar();
    Car createLuxuryCar();
}
class UsaCarFactory implements CarFactory {

    public Car createSmallCar() {
        return new SmallCar("1.0L", "Red", "Petrol");
    }

    public Car createSedanCar() {
        return new SedanCar("2.0L", "Blue", "Petrol");
    }

    public Car createLuxuryCar() {
        return new LuxuryCar("3.5L", "Black", "Petrol");
    }
}

class AsiaCarFactory implements CarFactory {

    public Car createSmallCar() {
        return new SmallCar("0.8L", "White", "Electric");
    }

    public Car createSedanCar() {
        return new SedanCar("1.5L", "Silver", "Hybrid");
    }

    public Car createLuxuryCar() {
        return new LuxuryCar("2.5L", "Champagne", "Hybrid");
    }
}
