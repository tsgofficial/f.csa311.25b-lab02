package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    final private double height;
    final private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Shape interface-ийн default getArea method-ийг override хийх
    @Override
    public double getArea() {
        return height * width;
    }

    // Shape interface-ийн default draw method-ийг override хийх
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle of height " + height + " and width " + width);
    }
}
