package oop;

public class MethodOverloading {
    public static void main(String[] args) {

        Car2 car=new Car2();
        car.setAllInfo("Malibu","Oq","Avtomat",20000);
        car.getModel();
        car.getUzatma();
        car.getColor();
        car.getPrice();


        System.out.println();
        Shakil burchak=new Shakil();
        burchak.peremetr(4,5,6);
        burchak.uchburchakYuzasiz(5.0,6.0);

        System.out.println();
        Point p=new Point(4,3,2);
        p.getX();
        p.getY();
        p.getZ();
        p.getAll();

    }



}
class Car2{
    private String rang, model, uzatma;
    private double narx;
    public void setAllInfo(String model, String rang, String uzatma, double narx){
        this.model=model;
        this.rang=rang;
        this.uzatma=uzatma;
        this.narx=narx;
    }
    public void getModel(){
        System.out.println("Model: "+model);
    }
    public void getColor(){
        System.out.println("Rangi: "+rang);
    }
    public void  getUzatma(){
        System.out.println("Uzatma turi: "+uzatma);
    }
    public void getPrice(){
        System.out.println("Narxi: "+narx);
    }
}

// peremetr
class Shakil{

    public void uchburchakYuzasiz(int a, int b){
        System.out.println( (1.0/2)*a*b );
    }

    public void uchburchakYuzasiz(double a, double b){
        System.out.println( (1.0/2)*a*b );
    }
    public void uchburchakYuzasiz(float a, float b){
        System.out.println( (1.0/2)*a*b );
    }

    public void uchburchakYuzasiz(long a, long b){
        System.out.println( (1.0/2)*a*b );
    }
    // peremetr

    public void  peremetr(int a, int b, int c){
        System.out.println((a+b+c));
    }

    public void  peremetr(double a, double b, double c){
        System.out.println((a+b+c));
    }
    public void  peremetr(float a, float b, float c){
        System.out.println((a+b+c));
    }
    public void  peremetr(long a, long b, long c){
        System.out.println((a+b+c));
    }
}

// class point 3-msala
class Point{
    private double x,y,z;

    public  Point(){}
    public  Point(double x,double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public void getX(){
        System.out.println(x);
    }
    public void getY(){
        System.out.println(y);
    }
    public void getZ(){
        System.out.println(z);
    }

    public void getAll(){
        System.out.println("x: "+x+" y: "+y+" z: "+z);
    }
}
