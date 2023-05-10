package Collections.ListConcept;

import OOPSConceptsPart1.CarOOPS1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

//    Properties of ArrayList
//    1. Can contain duplicate values
//    2. Maintains insertion order
//    3. Not Synchronized --> Multiple threads can run simultaneously
//    4. Allows random access to fetch any element(As it stores on basis of indices)
//    5. Implements the List interface and extends the AbstractList class
//    6.Generic vs Non Generic -> Generic means created with  specific datatype
//
//
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);

        System.out.println(ar.size());

        ar.add(400);
        ar.add(500);

        System.out.println(ar.size());

        ar.add("Tom");
        ar.add(true);

        System.out.println(ar.size());
        System.out.println(ar.get(5));


        for (Object obj:
           ar  ) {
            System.out.println(obj);
        }


        ArrayList<Integer> arInteger = new ArrayList<Integer>();
        arInteger.add(2);

        ArrayList<String> arString = new ArrayList<String>();
        arString.add("Name");
        arString.add("Class");
        arString.add("RollNo");
        arString.add("Exam");

        Iterator<String> iteratorString = arString.iterator();

       while(iteratorString.hasNext())
       {
           String str=iteratorString.next();
           System.out.println(str);
       }

        System.out.println("**********");

        //addAll()
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("Jashan");
        ar1.add("10th");
        ar1.add("9051");
        ar1.add("VIT");



        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Jasmeet");
        ar2.add("12th");
        ar2.add("e46554323");
        ar2.add("SGGS");

        ar1.addAll(ar2);
        System.out.println(ar1.size());

        Iterator<String> iteratorTest = ar1.iterator();

        while(iteratorTest.hasNext())
        {
            String abc=iteratorTest.next();
            System.out.println(abc);
        }




    }
}
