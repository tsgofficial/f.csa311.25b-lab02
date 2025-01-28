package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

// Renderer class-ийг Shape interface-ийг aвдаг болгосноор зөвхөн
// Rectangle биш бүх Shape class-ийг implement хийсэн class-уудыг дамжуулж болно

public class Renderer {
    final private Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
        System.out.println("""
                Shape printed
                Its area is %s
                """.formatted(shape.getArea()));
    }
}
