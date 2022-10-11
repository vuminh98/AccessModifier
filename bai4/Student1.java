package bai4;

public class Student1 {
    private String name = "John";
    private String classes ="C02";

    public Student1() {
    }
     public void setName() {
        name = "Minh";
    }

    public void setClasses() {
        classes = "C08";
    }
    public void display() {
        System.out.println("Student has the name is: " + name + " " + "and learn at: " + classes);
    }

}
