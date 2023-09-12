//Класс квадрат

public class Square implements IShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side*4;
    }
}
