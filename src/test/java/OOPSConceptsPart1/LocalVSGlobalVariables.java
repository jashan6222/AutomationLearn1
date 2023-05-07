package OOPSConceptsPart1;

public class LocalVSGlobalVariables {

    //Global or Class variables
    String name="Tom";
    int age=25;
    public static void main(String[] args) {
        int i=10;// Local Variable
        LocalVSGlobalVariables obj=new LocalVSGlobalVariables();
        System.out.println(obj.name);
    }
    public void someMethod(){
        int i=10;
        int j=20;
        int age=25;
    }
}
