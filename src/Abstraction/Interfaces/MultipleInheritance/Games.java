package Abstraction.Interfaces.MultipleInheritance;

public class Games implements Nihal,Gaurav{

    @Override
    public void play() {
        System.out.println("Nihal and Gaurav are playing");
    }

    public static void main(String[] args) {
        Games games = new Games();
        games.play();
    }
}
