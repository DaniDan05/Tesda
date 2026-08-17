abstract class AbstractShape implements Shape {
    private String color;
    private double length;
    private double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
}