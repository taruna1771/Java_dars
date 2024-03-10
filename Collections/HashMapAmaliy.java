import java.net.InterfaceAddress;
import java.util.*;

public class HashMapAmaliy {
    public static void main(String[] args) {

        MapClas obj=new MapClas();


        //1-topshiriq
        HashMap<String, Integer> hashMap = new HashMap<>();
        // Qiymatlarni to'ldirish
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 15);
        hashMap.put("Grapes", 30);

        // HashMapni chiqarish
        System.out.println("HashMap: " + hashMap);

        for (Map.Entry<String ,Integer> item:hashMap.entrySet()){
            System.out.println("Key: "+item.getKey()+"  Value: "+item.getValue() );
        }

        int hajm=hashMap.size();
        System.out.println("To'plam hajmi: " + hajm);







        //2-topshiriq
        HashMap<String , Integer> hashMap1=new HashMap<String ,Integer>();
        hashMap1.put("Qovun", 200);
        hashMap1.put("Tarvuz", 300);
        hashMap1.put("Handalak", 250);
        hashMap1.put("Uzum", 300);

        HashMap<String, Integer> hashMap2=new HashMap<String, Integer>();
        hashMap2.putAll(hashMap);
        hashMap2.putAll(hashMap1);
        System.out.println("Birlashgan Map: "+hashMap2);

        obj.faqatQiymat(hashMap2);

        hashMap2.clear();
        if(hashMap2.isEmpty()){
            System.out.println("Map bo'shagan!");
        }








        //3-masala
        HashMap<String, Integer> clonMap=(HashMap<String, Integer>) hashMap.clone();
        System.out.println("Clonlashgan map: "+clonMap );

        ArrayList<Integer> list=new ArrayList<Integer>();
        list=obj.convertArray(clonMap);
        System.out.println("ArrayList bolgan clon: "+list);







        //4-masala
        TreeMap<String, Integer> treeMap=new TreeMap<String ,Integer>();
        treeMap.put("Ananas",2300);
        treeMap.put("Apelsin",1300);
        treeMap.put("Anor",1200);
        treeMap.put("Olcha",1000);
        treeMap.put("Anjir",2500);
        System.out.println("Yaratilgan TreeMap: "+treeMap );

        System.out.println("Birinchi element: "+treeMap.firstEntry());
        System.out.println("Ohirgi element: "+treeMap.lastEntry());

        NavigableSet<String> navigableSet=treeMap.descendingKeySet();
        for (String key:navigableSet){
            System.out.println(key);
        }




        //5-masala
        TreeMap<Integer, String> treeMap1=new TreeMap<Integer,String>();
        treeMap1.put(1,"Anor");
        treeMap1.put(2,"Anjir");
        treeMap1.put(3,"Ananas");
        treeMap1.put(4,"Olma");
        treeMap1.put(5,"Bexi");
        treeMap1.put(6,"Shaftoli");


        System.out.println("Berilgan qiymatdan kichiklari");
        int key=3;
        for (Integer int_key : treeMap1.keySet()){
            if(int_key<key){
                System.out.println(treeMap1.get(int_key));
            }
        }

        System.out.println("TreeSet orqali ifodalangani");
        TreeSet<Integer> treeSet = new TreeSet<>(treeMap1.keySet());
        // TreeSet ni ekranga chiqarish
        System.out.println("TreeSet kalitlari:");
        for (Integer key1 : treeSet) {
            System.out.println(key1);
        }




        treeMap1.clear();
        if(treeMap1.isEmpty()){
            System.out.println("Bo'shatildi");
        }

    }
}
class  MapClas{

    public ArrayList<Integer> convertArray(HashMap<String ,Integer> map){
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }


    public void faqatQiymat(HashMap<String , Integer> map){
        for(Map.Entry<String ,Integer> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
