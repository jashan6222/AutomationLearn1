package JavaLearning;

public class IfElseConcept {

    public static void main(String[] args) {
        int a=1;
        int b=2;

        if (a>b){
            System.out.println("Satisfied");
        }
        else {
            System.out.println("Unsatisfied");
        }

        // Write a logic to find out biggest number

        int c =1000;
        int d =2000;
        int e= 300;

        if (c>d&&c>e){
            System.out.println("C is biggest");
        } else if (d>c&&d>e) {
            System.out.println("D is biggest");
        }
        else {
            System.out.println("E is biggest");
        }

    }




}
