package com.qa;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, String color, double x,
                  double y, double radius) {
        super(name, color, x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point getCenterPoint() {
        return new Point(getX(), getY());
    }
}
