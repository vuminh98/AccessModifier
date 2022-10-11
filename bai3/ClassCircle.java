package bai3;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class ClassCircle {
    private double radius = 1.0;
    private String color = "red";

    public ClassCircle(){
    }

    public String getColor(){
        return color;
    }
    public ClassCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
return radius*radius*Math.PI;
    }

    public double getRadius() {
return radius;
    }
}
