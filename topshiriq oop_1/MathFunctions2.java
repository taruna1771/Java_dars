package oop;
public class MathFunctions2 {
    public static void main(String[] args) {
        MathFunctions2 test=new MathFunctions2();
        System.out.println(test.add(2,2));
        System.out.println(test.sub(3,4));
        System.out.println(test.multiply(2,4));
        System.out.println(test.div(4,4));
        System.out.println(test.abs(-3));
        System.out.println(test.pow(5));
    }
    public double add(double a, double b){
        return a+b;
    }
    public  double sub(double a, double b){
        return a-b;
    }
    public  double multiply(double a, double b){
        return a*b;
    }
    public  double div(double a, double b){
        return a/b;
    }
    public double abs(double a){
        return a>0?a:a*-1;
    }

    public double pow(double a){
        return a*a;
    }

}
