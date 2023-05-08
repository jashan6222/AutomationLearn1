package ChatGPTProblem.May8th;

public class Animal {

    static int totalAnimals;
    String name;
    int age;
    boolean isHungry;

    public Animal(String cName, int cAge)
    {
        this.name=cName;
        this.age= cAge;
        totalAnimals++;
    }

    public void speak()
    {
        System.out.println("My name is : "+name);
    }

    public void eat()
    {
        isHungry = false;
    }

    public static void getTotalAnimals()
    {
        System.out.println("Total animals are : "+totalAnimals);
    }

    public Animal(){};


}
