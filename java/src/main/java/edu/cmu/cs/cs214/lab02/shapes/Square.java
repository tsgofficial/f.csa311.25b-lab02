package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    final private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    // Shape interface-ийн default getArea method-ийг override хийх
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }

    // Shape interface-ийн default draw method-ийг override хийх
    @Override
    public void draw() {
        System.out.println("Drawing a square of side " + sideLen);
    }
}
