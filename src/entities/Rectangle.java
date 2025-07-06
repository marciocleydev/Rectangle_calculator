package entities;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.height + this.width);
    }


    public double diagonal() {
        return Math.sqrt(((this.height * this.height) + (this.width * this.width)));
    }
}
