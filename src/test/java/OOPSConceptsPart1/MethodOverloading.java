package OOPSConceptsPart1;

public class MethodOverloading {
    public static void main(String[] args) {

        //Method Overloading -> Methods with same name within the same class with different arguments
        // main() Can be overloaded
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(2);
        obj.sum(2,3);

    }
    public void sum(){
        System.out.println("Sum Method with zero param");
    }

    public void sum(int i){
        System.out.println("Sum Method with one param: "+i);
    }
    public void sum(int i, int j){
        System.out.println("Sum Method with two params: "+(i+j));
    }
}
