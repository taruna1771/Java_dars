import java.util.ArrayList;
import java.util.Scanner;

import java.util.Collections;

public class Collection {


    public static void main(String[] args) {
//        //ArrayList topshiriqlar A
//        ArrayList<String> ranglar =new ArrayList<String>();
//        ranglar.add("Ko'k");
//        ranglar.add("Yashil");
//        ranglar.add("Qizil");
//        ranglar.add("Qora");
//        ranglar.add("Oq");
//        ranglar.add("Pushti");
//        ranglar.add("Jigar");
//
//        ranglar.forEach(item->{
//            System.out.println(item);
//        });
//        //ArrayList topshiriqlar B
//        ranglar.set(0,"Blue");
//        System.out.println("ArrayListning o'zgartirilgan birinchi elementi: "+ranglar.get(0));
//
//        //ArrayList topshiriqlar C
//
//        int uzunlik= ranglar.size();
//        System.out.println("Arrayning uzunligi: "+uzunlik);




//
//        //ArrayList topshiriqlar 2:  A)
//        ArrayList<String> names=new ArrayList<String>();
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Izlanayotgan ism: ");
//        String serach= scan.nextLine();
//        names.add("Sarabek");
//        names.add("Anvar");
//        names.add("Sardor");
//        names.add("G'anisher");
//        names.add("Imona");
//        names.add("Shahzoda");
//        String natija="";
//
//        for (int i = 0; i < names.size(); i++) {
//            if(names.get(i).equals(serach)){
//                natija=names.get(i);
//                break;
//            }
//        }
//        if(natija.equals("")){
//            System.out.println("Izlanayotgan ma'lumot topilmadi!!!");
//        }
//        else{
//            System.out.println("Izlanayotgan ma'lumot topildi: "+natija);
//        }
//
//
//
//
//
//       // b) ArrayListdan nusxa oling.
//
//        ArrayList<String> names2=new ArrayList<String>(names);
//        names2.add("Ilyos");
//        names2.forEach(item->{
//            System.out.println(item);
//        });
//
//
//      //  c) ArrayList elementlarni aralashtirish uchun dastur yozing.
//        System.out.println("\n\n\n\n C variant ");
//        Collections.sort(names);
//        names.forEach(item->{
//            System.out.println(item);
//        });





       // 3-topshiriq
//        ArrayList<Integer> sonlar=new ArrayList<Integer>();
//        sonlar.add(23);
//        sonlar.add(22);
//        sonlar.add(33);
//        sonlar.add(43);
//        sonlar.add(13);
//        sonlar.add(-23);
//
//        Collections.sort(sonlar,Collections.reverseOrder());
//        sonlar.forEach(son->{
//            System.out.println(son);
//        });
//
//
//        ArrayList<Integer> result=new ArrayList<Integer>();
//        Arrayga obj=new Arrayga();
//        result = obj.kesish(sonlar);
//        System.out.println("\n\n\n Natija: ");
//
//        result.forEach(son->{
//            System.out.println(son);
//        });





//        // 4-topshiriq
//        ArrayList<String> color1=new ArrayList<String>();
//        ArrayList<String> color2=new ArrayList<String>();
//        color1.add("Yellow");
//        color1.add("Orange");
//        color1.add("Blue");
//        color1.add("Gren");
//
//        color2.add("Yashil");
//        color2.add("Orange");
//        color2.add("Ko'k");
//        color2.add("Gren");
//        color2.add("Qizil");
//        color2.add("Qizil");
//
//        ArrayList<String> natija=new ArrayList<String>();
//        Arrayga obj2=new Arrayga();
//        natija=obj2.solishtirish(color1,color2);
//        natija.forEach(item->{
//            System.out.println(item);
//        });







        //5-topshiriq

        ArrayList<String> color1=new ArrayList<String>();
        color1.add("Yellow");
        color1.add("Orange");
        color1.add("Blue");
        color1.add("Gren");
        color1.forEach(item->{
            System.out.println(item);
        });

        Arrayga obj3=new Arrayga();
        System.out.println("\n\n\nNatija\n");
        color1=obj3.swap(color1,0,3);
        color1.forEach(item->{
            System.out.println(item);
        });




        //B)

        ArrayList<Integer> sonlar=new ArrayList<Integer>();
        sonlar.add(2);
        sonlar.add(22);
        sonlar.add(32);
        ArrayList natija=new ArrayList();
        natija=obj3.add2Arrays(color1,sonlar);
        natija.forEach(item->{
            System.out.println(item);
        });


        System.out.println("\n\nNatija");
        sonlar=obj3.ortirish2x(sonlar);
        sonlar.forEach(item->{
            System.out.println(item);
        });






    }

}
class Arrayga{
    ArrayList ss=new ArrayList();


    public  ArrayList ortirish2x(ArrayList list){
        list.addAll(list);
        return list;
    }






    public ArrayList add2Arrays(ArrayList a, ArrayList b){
        a.addAll(b);
        return a;
    }








    public ArrayList swap(ArrayList list,int a,int b){
        ss.clear();
        if(list.size() > a && list.size() > b ){
            ss.add(list.get(a));
            list.set(a,list.get(b));
            list.set(b,ss.get(0));

        }
        else {
            System.out.println("Siz chegaradan tashqaridagi indexlarni berdingiz!!!");
        }
        return list;

    }


    public  ArrayList<Integer> kesish(ArrayList<Integer> son){
        ArrayList<Integer> natija=new ArrayList<>(son);
        natija.remove(0);
        natija.remove(natija.size()-1);
        return natija;
    }

    public ArrayList<String> solishtirish(ArrayList<String> a,ArrayList<String> b){
        ArrayList<String> c=new ArrayList<String>();
        int min=Math.min(a.size(),b.size());
        int max=Math.max(a.size(),b.size());
        for (int i = 0; i < min; i++) {
            if(a.get(i).equals(b.get(i))){
                c.add("YES");
            }
            else {
                c.add("NO");
            }
        }
        for (int i = min; i < max; i++) {
            c.add("NO");
        }
        return c;
    }
}
