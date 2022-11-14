package Figures;

public class TestShape {
    public static void main(String[] args) {
       Shape s1 = new Circle(15);
       Shape s2 = new Square(10);
       Shape s3 = new Triangle(3,5,7,4);

       System.out.println("Одинаковая ли площадь у трёх фигур? "+equalArea(s1, s2));

       touchShape(s1);
       touchShape(s2);
       touchShape(s3);
    }

    public static boolean equalArea(Shape s1, Shape s2) {
        return s1.createArea() == s2.createArea();
    }
    public static void touchShape(Shape s){
        System.out.println("Площадь равна "+s.createArea());
        System.out.println("Периметр равен "+ s.createPerimeter());
    }
}

