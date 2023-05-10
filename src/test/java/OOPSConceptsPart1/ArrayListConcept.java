package OOPSConceptsPart1;

import java.util.ArrayList;

public class ArrayListConcept {
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

        ArrayList<String> arString = new ArrayList<String>();
        arString.add("Name");
        ArrayList<Integer> arInteger = new ArrayList<Integer>();
        arInteger.add(2);

    }
}
