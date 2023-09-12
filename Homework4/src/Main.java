public class Main {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10);
        Rectangle rectangle1 = new Rectangle(5,10);
        Triangle triangle1 = new Triangle(3,4,5);
        Square square1 = new Square(4);
        Polygon polygon1 = new Polygon(6, 5);
        figureBox.add(circle1);
        figureBox.add(rectangle1);
        figureBox.add(square1);
        figureBox.add(triangle1);
        figureBox.add(polygon1);
        figureBox.remove(0);

        figureBox.getInfo(3);
        figureBox.search(polygon1);
    }
}