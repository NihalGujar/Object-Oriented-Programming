package Abstraction.AbstractClasses;

public abstract class Task {
    String studentName;
    public abstract void read(String subjectName);
    public abstract void eat();
    public abstract void write();

    public void StudentName(String name)
    {
        studentName = name;
        System.out.println(studentName);
    }
}
