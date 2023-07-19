

import shapes.*;
import shapes.Triangle;
import shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Drawing Square:");
        square.draw();
        System.out.println();

        Triangle triangle = new Triangle(6);
        System.out.println("Drawing Triangle:");
        triangle.draw();
        System.out.println();

        Circle circle = new Circle(5);
        System.out.println("Drawing Circle:");
        circle.draw();
        System.out.println();
    }
}
