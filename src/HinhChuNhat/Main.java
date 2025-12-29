package HinhChuNhat;

public class Main {
    private double width;
    private double height;

    public Main() {
    }

    public Main(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public void display() {
        System.out.println("Area is: " + getArea());
        System.out.println("Perimeter is: " + getPerimeter());
    }
}
