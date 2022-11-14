package Figures;

public abstract class Shape {
    private boolean filled;

    protected Shape(){

    }
    protected Shape(boolean filled){
        this.filled=filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
    public abstract double createArea();

    public abstract double createPerimeter();
}
