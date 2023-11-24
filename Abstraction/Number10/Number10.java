abstract class Shape2D {
    abstract void draw();
    abstract void resize(double factor);
}

class Rectangle extends Shape2D {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    void draw() {
        System.out.println("Drawing Rectangle with width " + width + " and height " + height);
    }

    
    void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("Resizing Rectangle to width " + width + " and height " + height);
    }
}

class Circle extends Shape2D {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    
    void draw() {
        System.out.println("Drawing Circle with radius " + radius);
    }

   
    void resize(double factor) {
        radius *= factor;
        System.out.println("Resizing Circle to radius " + radius);
    }
}

public class Number10 {
    public static void main(String[] args) {
      
        Rectangle rectangle = new Rectangle(5, 3);
        rectangle.draw();
        rectangle.resize(1.5);

        Circle circle = new Circle(4);
        circle.draw();
        circle.resize(2);
    }
}
