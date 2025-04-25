// Class 1: Person
class Person {
    // Fields
    
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Class 2: Address
class Address {
    // Fields
    
    String city;
    String state;

    // Constructor
    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Method
    void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}

// Class 3: Main class to demonstrate object creation and method calling
public class pblm11 {
    public static void main(String[] args) {
        // Initialize Person object using reference variable and dot operator
        Person person = new Person("Mahim", 21);
        person.displayInfo();

        // Initialize Address object using reference variable and dot operator
        Address address = new Address("Naogaon", "Bangladesh");
        address.displayAddress();

        // Using multiple class objects together
        System.out.println("\nPerson with Address:");
        person.displayInfo();
        address.displayAddress();
    }
}