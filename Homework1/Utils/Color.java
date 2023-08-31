package Homework1.Utils;

public class Color {
    public String colorName;
    public Point3D redGreenBlue;

    public Color(String colorName, Point3D redGreenBlue) {
        this.colorName = colorName;
        this.redGreenBlue = redGreenBlue;
    }

    public String getColorName() {
        return colorName;
    }
    public Point3D getRedGreenBlue() {
        return redGreenBlue;
    }
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
    public void setRedGreenBlue(Point3D redGreenBlue) {
        this.redGreenBlue = redGreenBlue;
    }
}