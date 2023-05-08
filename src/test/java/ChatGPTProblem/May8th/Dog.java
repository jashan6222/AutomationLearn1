package ChatGPTProblem.May8th;

public class Dog extends Animal{


    String breed;
    String colour;

    static int totalDogs;

    public Dog(String cName, int cAge, String cBreed, String cColour)
    {
        this.name=cName;
        this.age=cAge;
        this.breed=cBreed;
        this.colour=cColour;
        totalDogs++;
    }

    public void speak()
    {
        System.out.println("Hello! My name is "+name+" and i'm a "+breed);
    }
    public void eat()
    {
        isHungry=false;
        System.out.println("Oh my Gosh I'm Full!");
    }

    public static void getTotalDogs()
    {
        System.out.println("Total dogs are : "+totalDogs);
    }


}
