package Figures;

import Figures.Shape;

public class Circle extends Shape {

    private double radius;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(boolean filled, double radius) {
        super(filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }



    @Override
    public double createArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double createPerimeter() {
        return 2 * radius * Math.PI;
    }


}
