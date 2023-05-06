package JavaLearning;

public class LoopsConcept {
    public static void main(String[] args) {
        //while loop
        int a=0;
        while (a<=10){
            //System.out.println(a);
            a++;
        }
        //For loop

        for (int i=10;i>=0;i--)
        {
            //System.out.println(i);
        }

        //Post increment j=i++ --> first j=i and then i is incremented

        int i=1;
        int j=i++;
        System.out.println(i);
        System.out.println(j);

        // Pre Increment j=++i --> First i will be incremented then given value



    }


}
