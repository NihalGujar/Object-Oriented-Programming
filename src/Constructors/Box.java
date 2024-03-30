package Constructors;

public class Box {
    public int length, breadth;

    //default constructor
    public Box()
    {
        System.out.println("from default: " + length * breadth);
    }

    //Parameterized Constructor
    public  Box(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
        System.out.println("from parameterized: " + this.length*this.breadth);
    }

    //copy constructor
    public Box(Box box)
    {
        this.length = box.length;
        this.breadth = box.breadth;
        System.out.println("from copy: " + this.length*this.breadth);
    }
}
