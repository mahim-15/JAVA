
interface Animal {
    void eat();  // Abstract method (no implementation)
    void sleep();
}

// Defining an abstract class that implements the interface
abstract class Mammal implements Animal {
    // Implementing one method from the interface
    public void sleep() {
        System.out.println("Mammal is sleeping...");
    }
    
    // Abstract method (subclasses must implement this)
    abstract void makeSound();
}

// Concrete class extending the abstract class
class Dog extends Mammal {
    
    void makeSound() {
        System.out.println("Dog barks...");
    }
    public void eat() {
        System.out.println("Dog is eating...");
    }
}

// Main class to test the code
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();       // Calls Dog's eat method
        myDog.sleep();     // Calls Mammal's sleep method
        myDog.makeSound(); // Calls Dog's makeSound method
    }
}