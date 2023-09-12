//Класс многоугольник

public class Polygon implements IShape {
    private int numSides; //Количество сторон многоугольника
    private double sideLength; //Длина каждой стороны

    public Polygon(int numSides, double sideLength) {
        this.numSides = numSides;
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (this.numSides*this.sideLength*this.sideLength) / (4 * Math.tan(Math.PI / this.numSides));
    }

    @Override
    public double getPerimeter() {
        return this.numSides*this.sideLength;
    }
}

