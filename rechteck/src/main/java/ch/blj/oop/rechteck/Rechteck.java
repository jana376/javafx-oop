package ch.blj.oop.rechteck;

public class Rechteck {

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double value) {
        height = value;
    }

    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double value) {
        height = value;
    }

    public double getArea() {
        double result = height * width;

        return result;
    }
}
