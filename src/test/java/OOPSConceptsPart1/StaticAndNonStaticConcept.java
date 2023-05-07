package OOPSConceptsPart1;

public class StaticAndNonStaticConcept {
    String name="Tom";
    static int age=25;

    //Static methods/variables can be called directly and by using classname(Line 12)
    // Static variables/methods are not linked to object
    //We CAN call static method using the class object but its not advisable
    // (Coz they're freely available and there's no need to create an object in memory to access them)
    public static void main(String[] args) {

        StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
        sum();
        StaticAndNonStaticConcept.sum();
        obj.sendMail();
        System.out.println("Static variable called directly: "+age);
        System.out.println("Static Variable called using classname: "+StaticAndNonStaticConcept.age);
        System.out.println("Non Static variable called using class object: "+obj.name);
        obj.sum();
    }

    public void sendMail(){
        System.out.println("Non StaticSend Mail Method");
    }
    public static void sum(){
        System.out.println("Static Sum Method");
    }
    }
