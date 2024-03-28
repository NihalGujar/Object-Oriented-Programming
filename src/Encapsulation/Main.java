package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
//        employee.name = "Nihal"; -> due to Private(Accessible only within class) access modifier not able to access
        employee.designation = "SDE"; ///due to Public(Accessible everywhere) access modifier accessible everywhere
        System.out.println(employee.designation);
    }
}
