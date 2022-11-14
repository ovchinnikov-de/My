package Figures;

import Figures.Shape;

public class Square extends Shape {

    private double width;

    public Square(){

    }

    public Square(double width) {
        this.width = width;
    }

    public Square(boolean filled, double width) {
        super(filled);
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double createArea() {
        return width * width;
    }

    @Override
    public double createPerimeter() {
        return width * 4;
    }
}
