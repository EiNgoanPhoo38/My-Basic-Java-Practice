package constructortest;

public class CarTest{
public static void main (String [] args) {
    Car car = new Car("Fit", "Red"); //creating object
    car.info();
    Car car1 = new Car("Mark2");
    car1.info();
    Car car2 = new Car("Black");
    car2.info();

    }
}
