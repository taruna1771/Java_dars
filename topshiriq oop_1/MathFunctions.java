package oop;

public class MathFunctions {

    static double pi=3.14159265359;
    static double e=2.71828182846;

    public double doiraYuzi(double r){
        return pi*Math.pow(r,2);
    }
    public  double darajaPi(double son){
        return Math.pow(e,son);
    }
    private double peremetr(double a, double b, double c){
        return a+b+c;
    }
    public double yuzaUchburchak(double a, double b, double c){
        double s=peremetr(a,b,c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }



}
