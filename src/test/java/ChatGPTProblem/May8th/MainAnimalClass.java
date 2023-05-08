package ChatGPTProblem.May8th;

public class MainAnimalClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy",5,"Pomerian","White");
        Dog dog2 = new Dog("Bruno",6,"Labra","Golden");
        Dog dog3 = new Dog("Shelby",4,"Doberman","Black");
        Dog dog4 = new Dog("Tiger",3,"German Shephard","Black and Golden");
        Dog dog5 = new Dog("Jimmy",1,"Husky","Black n White");

        Animal animal1= new Animal("Horse",5);
        Animal animal2= new Animal("Cow",10);
        Animal animal3= new Animal("Cat",2);

        dog1.eat();
        dog2.speak();
        Dog.getTotalDogs();
        Animal.getTotalAnimals();
    }
}
