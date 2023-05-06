package OOPSConceptsPart1;

public class FunctionsConcept {
    public static void main(String[] args) {

        FunctionsConcept functionsConcept=new FunctionsConcept();
        functionsConcept.test();
        System.out.println(functionsConcept.qa
                (functionsConcept.divisionMethod
                        (functionsConcept.methodTwo(),functionsConcept.justReturn10())));


    }
    public void test(){
        System.out.println("Test Method");
    }

    public int methodTwo(){
        System.out.println("methodTwo Method");

        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }

    public String qa(double x){
        String s="Selenium";
        return s+" "+x;
    }

    public int justReturn10(){
        return 10;
    }
    public double divisionMethod(int x, int y){
        double d=x/y;
        return d;
    }
}
