package Abstraction.AbstractClasses;

public class Student extends Task{
    @Override
    public void read(String subjectName) {
        System.out.println("Nihal is reading: " + subjectName);
    }

    @Override
    public void eat() {
        System.out.println("Eating lunch");
    }

    @Override
    public void write() {
        System.out.println("Writing notes.");
    }
}
