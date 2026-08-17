class Rectangle extends AbstractShape {

    Rectangle(String color, double length, double width) {
        super(color, length, width);                        
    }

    @Override
    public double calculateArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getLength() + getWidth());
    }
}
