package oop;

public  class AbstrakAmaliy {
    public static void main(String[] args) {

        Triangle2 triangle=new Triangle2();
        System.out.println("1-shakil Triangle");
        System.out.println("Uchburchak yuzi: "+triangle.area(3,4,5));
        System.out.println("Uchburchak perimetri: "+triangle.perimetr(3,4,5));

        System.out.println("\n\n\n2-shakil Trapezium");
        Trapezium2 trapezium=new Trapezium2();
        System.out.println("Trapetsiya yuzi: "+trapezium.area(4,10,3));
        System.out.println("Trapetsiya Perimetri: "+trapezium.perimetr(4,10,3));

        System.out.println("\n\n\n3-shakil Rectangle");
        Rectangle2 rectangle=new Rectangle2();
        System.out.println("To'rtburchak yuzi: "+rectangle.area(4,5));
        System.out.println("To'rtburchak perimetri: "+rectangle.perimetr(4,5));
    }
}

abstract class GeometricFigure2{
    public abstract double area(double a,double b, double c);
    public abstract double area(double a,double b);

    public abstract double perimetr(double a, double b, double c);

    public abstract double perimetr(double a, double b);

}
class Triangle2 extends GeometricFigure2{
    @Override
    public double area(double a,double b, double c){
        double s2=(a+b+c)/2.0;
        return Math.sqrt(s2*(s2-a)*(s2-b)*(s2-c));
    }

    @Override
    public double area(double a, double b) {
        return 0;
    }

    @Override
    public  double perimetr(double a, double b, double c){
        return a+b+c;
    }

    @Override
    public double perimetr(double a, double b) {
        return 0;
    }
}
class Trapezium2 extends GeometricFigure2{
    @Override
    public double area(double a,double b, double c){
        return  (1.0/2)*(a+b)/c;
    }

    @Override
    public double area(double a, double b) {
        return 0;
    }

    @Override
    public  double perimetr(double a, double b, double c){
        return a+b+2*c; // c bu yerda h sifatida
    }

    @Override
    public double perimetr(double a, double b) {
        return 0;
    }
}

class Rectangle2 extends GeometricFigure2{

    @Override
    public double area(double a, double b, double c) {
        return 0;
    }

    @Override
    public double area(double a, double b){
        return a*b;
    }

    @Override
    public double perimetr(double a, double b, double c) {
        return 0;
    }

    @Override
    public  double perimetr(double a, double b){
        return (a+b)*2;
    }
}

