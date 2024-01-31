package oop;

public class Car {


    public void getColor(String color){
        System.out.println(color);
    }
    public void getModel(String model){
        System.out.println(model);
    }
    public  void getPrice(double price){
        System.out.println(price);
    }
    public void getTuzilma(String tuzilma){
        System.out.println(tuzilma);
    }


}
class Uchburchak{
    double a,b,c;

    public void setTomonlar(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
}

class Person{
   private double boy;
   private String ism,
    familya,
    sharif;
   private int yosh;

    public void getFullName(String ism, String familya, String sharif){
        this.ism=ism;
        this.familya=familya;
        this.sharif=sharif;
    }

    public  void getBoy(double boy){
        this.boy=boy;
    }
    public void getAge(int age){
        this.yosh=age;
    }
    public void getAllInfo(){
        System.out.println("Ism: "+ism);
        System.out.println("Familya: "+familya);
        System.out.println("Sharif: "+sharif);
        System.out.println("Yoshi: "+yosh);
        System.out.println("Bo'yi: "+boy);
    }






}
