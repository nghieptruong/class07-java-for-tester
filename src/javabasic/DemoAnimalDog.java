package javabasic;

public class DemoAnimalDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();

        Animal chihuahua = new Dog(); // upcasting
        Dog tom = (Dog) chihuahua; // downcasting
        tom.run();
    }
}
