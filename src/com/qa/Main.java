package com.qa;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("rectangle1", "yellow", 0,0,10,10);
        Rectangle r2 = new Rectangle("rectangle2", "green", 2,2,5,2);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println(r1 + " Center Point is: " + r1.getCenterPoint());
        System.out.println(r1 + " Is square? " + (r1.isSquare()?"Yes":"No"));
        System.out.println(r1 + " Area: " + r1.getArea());

        System.out.println(r2 + " Center Point is: " + r2.getCenterPoint());
        System.out.println(r2 + " Is square? " + (r2.isSquare()?"Yes":"No"));
        System.out.println(r2 + " Area: " + r2.getArea());

        Circle c1 = new Circle("circle1", "red", 0, 0, 10);
        Circle c2 = new Circle("circle2", "blue", 10, 10, 5);
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1 + " Center point is: " + c1.getCenterPoint());
        System.out.println(c1 + " Area is: " + c1.getArea());

        System.out.println(c2 + " Center point is: " + c2.getCenterPoint());
        System.out.println(c2 + " Area is: " + c2.getArea());

        Shape s = new Circle("circle", "green", 2, 2, 2);
        System.out.println(s.getColor());

        Circle c3 = new Circle("circle3", "white", 0,0,10);
        System.out.println(c3.getX() + " " +c3.getY());
        c3.move(10.5, 4.3);
        System.out.println(c3.getX() + " " +c3.getY());

    }
}
