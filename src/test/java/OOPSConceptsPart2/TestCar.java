package OOPSConceptsPart2;

public class TestCar {
    public static void main(String[] args) {
        BMW bmw= new BMW();
        bmw.start();
        // Method Overriding --> When method is present in parent and child class
        // Method Overriding will always give preference to child class
        // Static Polymorphism --> Compile time Polymorphism

        bmw.stop();
        bmw.refule();
        bmw.theftSafety();
        bmw.engine();

        System.out.println("----");

        Car car= new Car();
        car.start();
        car.stop();
        car.refule();

        System.out.println("----");

        Car car1= new BMW();
        car1.start();
        // Top Casting == Dynamic Polymorphism  -> Child class object can  be reffered by Parent class reference variable

        //It'll throw ClassCastException'

        // Down Casting not allowed --> Parent class object reffered by child class reference variable
        //Dynamic polymorphism or Run-time Polymorphism
        // Run Time polymorphism can only access Overridden methods.. It cannot access native methods of child class
        //Only Child class reference variable can access native methods



    }
}
