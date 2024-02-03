package oop;

import javax.print.Doc;

public class InheritanceAmaliy {
    public static void main(String[] args) {

        Xirurg xirurg=new Xirurg();
        xirurg.setInfo("Anvar","Narzullayev","Akmalovich","Tshkent sh","992322222",2000);
        xirurg.getAllInfo();
        xirurg.soha();

        Lor lor=new Lor();
        lor.getAllInfo(); //Lorga Malumotlar kiritmaganligimiz uchun barcha qiymatlar default holatda bo'sh bo'ladi
        lor.soha();


        System.out.println("\n\n\n\n");
        //2-amaliy electronica

        Compyuters compyuters =new Compyuters();
        compyuters.getName();
        compyuters.getBolim();

        System.out.println("\n\n\n\n");
        Laptop laptop=new Laptop("Rog Strix","Asus","ryzan 7 1tb ssd Gpu: RTX 3050 4gb Ram:16gb ddr5 4800mhz",1000);
        laptop.getInfoLaptop();

        System.out.println("\n\n\n\n");
            Subwoofer subwoofer= new Subwoofer();
    subwoofer.getName();
    subwoofer.getBolim();
    subwoofer.getInfoSub();







    }


}

class  Electronics{
    static String nom="Eldarado";

    public void getName(){
        System.out.println("Do'kon nomi: "+nom);
    }

}
class Compyuters extends Electronics{
    static String bolim="Compyuterlar";
    String model,brend,parametr;
    double price;
    public void getBolim(){
        System.out.println("Bo'lim nomi: "+bolim);
    }
    public void getInfo(){
        getName();
        getBolim();
        System.out.println("Model: "+this.model);
        System.out.println("Brend: "+this.brend);
        System.out.println("Parametr: "+this.parametr );
        System.out.println("Price: "+this.price+"$");
    }
}
class Pc extends Compyuters{
    static String tur="Stol kompyuteri(Pratsesor):";

    public Pc(String model, String brend, String parametr, double price) {
        this.model=model;
        this.brend=brend;
        this.parametr=parametr;
        this.price=price;
    }
    public void getInfoPC(){
        getInfo();
    }
}
class Laptop extends Compyuters{
    static String tur="Notbuk:";

    public Laptop(String model, String brend, String parametr, double price) {
        this.model=model;
        this.brend=brend;
        this.parametr=parametr;
        this.price=price;
    }
    public void getInfoLaptop(){
        getInfo();
    }
}

class Sound extends Electronics{
    public void getBolim(){
        System.out.println("Bu bo'lim musiqiy, tovush texnikalarga tegishli");
    }
}

class Subwoofer extends Sound{
    public void getInfoSub(){
        System.out.println("Bu Sound bo'limidagi Subwoofer bo'limi");
    }
}
class Loudspeaker extends Sound{
    public void getInfoSpeker(){
        System.out.println("Bu Sound bo'limidagi Subwoofer Loudspeaker");
    }
}





 class  Doctor{

    String ism, familya, sharif, manzil, nomer;
    int tug_yil;

    Doctor(){

    }
    public void  setInfo(String ism, String familya, String sharif, String manzil, String nomer, int tug_yil) {
         this.ism = ism;
         this.familya = familya;
         this.sharif = sharif;
         this.manzil = manzil;
         this.nomer = nomer;
         this.tug_yil = tug_yil;
     }
    public Doctor(String ism, String familya, String sharif, String manzil, String nomer, int tug_yil) {
        this.ism = ism;
        this.familya = familya;
        this.sharif = sharif;
        this.manzil = manzil;
        this.nomer = nomer;
        this.tug_yil = tug_yil;
    }
    public void getAllInfo(){
        System.out.println("Fish: "+this.ism+" "+this.familya+" "+this.sharif);
        System.out.println("Tug'ilgan yil: "+this.tug_yil);
        System.out.println("Manzil: "+this.manzil);
        System.out.println("Nomer: "+this.nomer);
    }
}

class Xirurg extends Doctor{

    public void soha(){
        System.out.println("Xirurg aperatsiyalarni amalga oshiradi");
    }
}
class  Lor extends Doctor{
    public void soha(){
        System.out.println("Eshitish yani quloq muamosi bo'lgan bemorlarni qabul qiladi.");
    }
}
