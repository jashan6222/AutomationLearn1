package OOPSConceptsPart1;

import java.util.Hashtable;

public class HashTableConcept {
    public static void main(String[] args) {
        Hashtable hashtable= new Hashtable();
        hashtable.put("A","Apple");
        hashtable.put("B","Ball");
        hashtable.put("C","Cat");
        hashtable.put("D","Donkey");

        System.out.println(hashtable.size());

        hashtable.put(1,200);
        hashtable.put(true,"Boolean");

        System.out.println(hashtable.get(true));
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.get("C"));

        for (Object obj :
                hashtable.keySet()) {
            System.out.println(obj+":"+hashtable.get(obj));

        }

        Hashtable<Integer,Integer> hashInteger = new Hashtable<Integer,Integer>();
        hashInteger.put(1,100);
        hashInteger.put(7,200);
        for(int i=0;i<hashInteger.keySet().size();i++)
        {
            System.out.println(hashInteger.keySet().toArray()[i]+":"+hashInteger.get(hashInteger.keySet().toArray()[i]));
        }
    }
}
