package OOPSConceptsPart1;

public class CarOOPS1 {
    //Global/Class variables
    int modelNumber;
    int wheels;

    public static void main(String[] args) {

        CarOOPS1 a=new CarOOPS1();// RHS will create an object(a is object reference variable )
        CarOOPS1 b= new CarOOPS1(); // new operator is used to create a new object
        CarOOPS1 c = new CarOOPS1();

        a.modelNumber=2015;
        a.wheels=4;
        b.modelNumber=2016;
        b.wheels=4;
        c.modelNumber=2022;
        c.wheels=4;

        System.out.println("Before changing references");

        System.out.println(a.modelNumber);
        System.out.println(a.wheels);
        System.out.println(b.modelNumber);
        System.out.println(b.wheels);
        System.out.println(c.modelNumber);
        System.out.println(c.wheels);


        System.out.println("After changing references");

        a=b;
        b=c;
        c=a;

        System.out.println(a.modelNumber);
        c.modelNumber=2023;
        System.out.println(a.modelNumber);
        System.out.println(c.modelNumber);



    }
}
