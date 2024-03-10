import java.util.*;

public class HashSetDars {
    public static void main(String[] args) {


        SetClass obj=new SetClass();


        //1-topshiriq
        HashSet<String> set=new HashSet<String>();
        set.add("Sarabek");
        set.add("Imona");
        set.add("Hakim");
        set.add("Anvar");
        set.add("Zuhra");
        set.add("Hasan");

        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("\n\n");
        ArrayList<String> list=new ArrayList<String>(set);
        Collections.reverse(list);
        list.forEach(item->{
            System.out.println(item);
        });





        //2-topshiriq
        System.out.println("HashSet uzunligi: "+set.size());
        String txt=(set.isEmpty())?"Bo'sh":"Bo'sh emas";
        System.out.println(txt);


        set.clear();
         txt=(set.isEmpty())?"Bo'sh":"Bo'sh emas";
        System.out.println(txt);


        //3-masala
        set.add("Sarabek");
        set.add("Imona");
        set.add("Hakim");
        set.add("Anvar");
        set.add("Zuhra");
        set.add("Hasan");

        HashSet<String> clonSet=(HashSet<String>) set.clone();
        System.out.println("KLON SET: "+clonSet);
        ArrayList<String> list1=new ArrayList<String>(clonSet);
        System.out.println("Array listga Converti: "+list1);

        for (int i = 0; i < list1.size(); i+=2) {
            System.out.println(list1.get(i));
        }



        // 4- masala
        HashSet<String>  set1=new HashSet<String >();
        set1.add("Apelsin");
        set1.add("Anor");
        set1.add("Anjir");
        set1.add("Anvar");
        set1.add("Zuhra");
        set1.add("Hasan");
        ArrayList<String> list2=new ArrayList<String>();
        list2=obj.dublikatSet(set1,set);
        System.out.println("Bir xil elementlar: "+ list2);


        ArrayList<String> list3=new ArrayList<String >();
        list3=obj.Mavjut(set1,set);
        System.out.println("Ikkala setda mavjud bolmagan elementlar: "+list3);







        //5-topshiriq
        ArrayList<String> list4=new ArrayList<String>();
        list4=obj.Mavjud1Da(set,set1);
        System.out.println("Birinchisda mavjud: "+list4);

        ArrayList<String> list5=new ArrayList<String>();
        list5=obj.Mavjud2Da(set,set1);
        System.out.println("Ikkinchisida mavjud: "+list5);

        HashSet<Integer> toplam1=new HashSet<Integer>();
        HashSet<Integer> toplam2=new HashSet<Integer>();
        toplam1.add(1);
        toplam1.add(2);
        toplam1.add(3);
        toplam1.add(4);
        toplam1.add(6);

        toplam2.add(9);
        toplam2.add(2);
        toplam2.add(5);
        toplam2.add(2);
        toplam2.add(8);

        ArrayList<Integer> list6=new ArrayList<Integer>();
        list6=obj.SonJuft(toplam1,toplam2);
        System.out.println("Faqat 2 ga karali sonlar tolami: "+list6);


    }
}
class SetClass{

    public ArrayList<Integer> SonJuft(HashSet<Integer> set1, HashSet<Integer> set2){
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(Integer son:set1){
            if(son%2==0){
                list.add(son);
            }
        }

        for(Integer son:set2){
            if(!set1.contains(son)){
                if(son%2==0){
                    list.add(son);
                }
            }
        }
        return list;
    }






    public ArrayList<String> Mavjud2Da(HashSet<String> set1, HashSet<String> set2){
        ArrayList<String> list =new ArrayList<String>();
        for (String soz:set2){
            if(!set1.contains(soz)){
                list.add(soz);
            }
        }
        return list;
    }




    public ArrayList<String> Mavjud1Da(HashSet<String> set1, HashSet<String> set2){
        ArrayList<String> list=new ArrayList<String>();
        for (String soz:set1){
            if(!set2.contains(soz)){
                list.add(soz);
            }
        }
        return list;
    }




    public ArrayList Mavjut(HashSet<String> set1, HashSet<String> set2){
        ArrayList<String> list=new ArrayList<String>();
        for (String soz:set1){
            if(!set2.contains(soz)){
                list.add(soz);
            }
        }

        for(String soz:set2){
            if(!set1.contains(soz)){
                list.add(soz);
            }
        }
        return list;
    }




    public  ArrayList dublikatSet(HashSet<String> a, HashSet<String> b){
        ArrayList<String> list=new ArrayList<String>();
        for (String item:a){
            if(b.contains(item)){
                list.add(item);
            }
        }
        return list;
    }
}
