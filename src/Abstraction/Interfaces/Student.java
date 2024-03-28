package Abstraction.Interfaces;

public class Student implements Task,Sunday {
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

    @Override
    public void cricket() {
        System.out.println("Playing cricket");
    }

    @Override
    public void Football() {
        System.out.println("Playing Football");
    }

    @Override
    public void Hockey() {
        System.out.println("Playing Hockey");
    }

    @Override
    public void watchMovie(String movieName) {

    }

    @Override
    public void playGame() {

    }
}
