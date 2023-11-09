// Base class 
class Shape {
   
    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Override
    public double getArea() {
        return width * height;
    }

    //Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class MainDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(9.0);
        Shape rectangle = new Rectangle(6.0, 5.0);
        Shape triangle = new Triangle(3.0, 5.0, 6.0);

        // Display Circle
        System.out.println("Circle - Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());

        // Display Rectangle
        System.out.println("Rectangle - Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());

        // Display Triangle
        System.out.println("Triangle - Area: " + triangle.getArea() + ", Perimeter: " + triangle.getPerimeter());
    }
}
