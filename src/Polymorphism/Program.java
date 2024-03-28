package Polymorphism;

public class Program {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.print("Nihal");
        p.print("Nihal", "Gujar");

        Parent p1 = new Child();
        p1.print("Nihal");
        p1.print("Nihal", "Gujar");

        Child c = new Child();
        c.print("Nihal");
        c.print("Nihal", "Gujar");

        //Child c1 = new Parent();
    }
}
