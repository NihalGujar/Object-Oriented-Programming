package Polymorphism;

public class Parent {
    void print(String name) {
        System.out.println("My Name is:" + name);
    }

    void print(String firstName, String lastName)
    {
        System.out.println("First name: " + firstName + " Last name: " + lastName);
    }
}
