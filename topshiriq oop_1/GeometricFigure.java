package oop;

public class GeometricFigure {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println("1-shakil Triangle");
        System.out.println("Uchburchak yuzi: "+triangle.area(3,4,5));
        System.out.println("Uchburchak perimetri: "+triangle.perimetr(3,4,5));

        System.out.println("\n\n\n2-shakil Trapezium");
        Trapezium trapezium=new Trapezium();
        System.out.println("Trapetsiya yuzi: "+trapezium.area(4,10,3));
        System.out.println("Trapetsiya Perimetri: "+trapezium.perimetr(4,10,3));

        System.out.println("\n\n\n3-shakil Rectangle");
        Rectangle rectangle=new Rectangle();
        System.out.println("To'rtburchak yuzi: "+rectangle.area(4,5));
        System.out.println("To'rtburchak perimetri: "+rectangle.perimetr(4,5));

    }
    public double area(double a,double b, double c){
        return 0;
    }
    public double area(double a,double b){
        return 0;
    }

    public  double perimetr(double a, double b, double c){
        return 0;
    }

    public  double perimetr(double a, double b){
        return 0;
    }
}


// 1-sahkilga
class Triangle extends GeometricFigure{
    public double area(double a,double b, double c){
        double s2=(a+b+c)/2.0;
        return Math.sqrt(s2*(s2-a)*(s2-b)*(s2-c));
    }

    public  double perimetr(double a, double b, double c){
        return a+b+c;
    }
}


//2-shakilga
class Trapezium extends GeometricFigure{
    public double area(double a,double b, double c){
        return  (1.0/2)*(a+b)/c;
    }

    public  double perimetr(double a, double b, double c){
        return a+b+2*c; // c bu yerda h sifatida
    }
}

class Rectangle extends GeometricFigure{

    public double area(double a,double b){
        return a*b;
    }
    public  double perimetr(double a, double b){
        return (a+b)*2;
    }
}
