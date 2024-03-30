package Constructors;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();

        Box box1 = new Box(4,5);
        Box box2 = new Box(box1);
    }
}
