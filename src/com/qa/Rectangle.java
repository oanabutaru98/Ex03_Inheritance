package com.qa;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(String name, String color, double x, double y, double height, double width) {
        super(name, color, x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public boolean isSquare() {
        return height == width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public Point getCenterPoint() {
        double centerX = getX() + width/2;
        double centerY = getY() + height/2;
        return new Point(centerX, centerY);
    }
}
