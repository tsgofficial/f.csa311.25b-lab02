package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(2, 3);

        Renderer cirRenderer = new Renderer(circle);
        Renderer sqrRenderer = new Renderer(square);
        Renderer recRenderer = new Renderer(rectangle);

        cirRenderer.draw();
        sqrRenderer.draw();
        recRenderer.draw();
    }
}
