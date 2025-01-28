package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    final private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Shape interface-ийн default getArea method-ийг override хийх
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Shape interface-ийн default draw method-ийг override хийх
    @Override
    public void draw() {
        System.out.println("Drawing a circle of radius " + radius);
    }
}
