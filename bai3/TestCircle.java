package bai3;

public class TestCircle {
    public static void main(String[] args) {
        ClassCircle circle = new ClassCircle();
        System.out.println("Color and radius of triangle default are: " + circle.getColor() + " " +circle.getRadius());
        ClassCircle circle1 = new ClassCircle(10);
        System.out.println("Area of the triangle is: " + circle1.getArea());
        ClassCircle circle2 = new ClassCircle(20);
        System.out.println("Area of the triangle is: " + circle2.getArea());
        ClassCircle circle3 = new ClassCircle(5);
        System.out.println("New radius of the triangle is: " + circle3.getRadius());

    }
}
