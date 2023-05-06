package JavaLearning;

public class ArrayConcept {

    //Problems of static array
    //1. Size is fixed --> Solution is to use collections ArrayList, HashTable etc which are also called dynamic array
    //2. Only one DataType --> Solution is to use Object Array

    //Object is a super-class of all the classes

    public static void main(String[] args) {

        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        System.out.println(a);
        for (int i=0;i<5;i++){
            System.out.println(a[i]);
            // If trying to access index greater than size
        }
        Object ob[]= new Object[5];
        ob[0]="TOM";
        ob[1]=2;
        ob[2]=2.3;
        ob[3]='c';
        ob[4]=true;

        for (Object obj:ob) {
            System.out.println(obj);
        }
    }



}
