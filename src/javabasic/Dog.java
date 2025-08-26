package javabasic;

public class Dog extends Animal {
    //Dog ke thua ham eat cua Animal
    //Dog dog = new Dog;
    //dog.eat(); // --> Eating

    // @Override : annotation (chú thích)
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void run() {
        System.out.println("Running...");
    }
}
