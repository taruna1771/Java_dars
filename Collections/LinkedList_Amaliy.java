import java.util.*;

public class LinkedList_Amaliy {
    public static void main(String[] args) {
        Array_method obj=new Array_method();

        LinkedList list=new LinkedList();
        list.add("Anvar");
        list.add("Anora");
        list.add("Zebiniso");
        list.add("Sanjar");
        list.add("Ahmad");


        //1-amaliy
//        obj.print(list);
//        list=obj.sizeDelete(list);// boshatiladi
//        list=obj.sizeDelete(list);      // boshatib bolingan


        //2-amaliy
//        obj.teskariChiqarish(list);
//        list=obj.addFirsLast(list ,"Bek", "Xon");
//        System.out.println("\n\n\n\n\n");
//        obj.print(list);
//        System.out.println("\n\n\n\n\n");
//        obj.getFirstLast(list);







        //3-topshiriq
//        System.out.println("\n\n\n\n\n");
//        list=obj.removeIndex(list,3);
//        obj.print(list);
//        System.out.println("\n\n\n\n\n");
//        list=obj.removeFirstLast(list);
//        System.out.println("\n\n\n\n\n");
//        list=obj.removeAll(list);
//        obj.print(list);



        //  4-topshiriq
          LinkedList number=new LinkedList();
          number.add(2);
          number.add(23);
          number.add(32);
          number.add(-21);

          LinkedList natija;
          natija=obj.add2LinkedList(list,number);
          obj.print(natija);
          LinkedList list_copy= (LinkedList)number.clone();
          System.out.println("\n\n");
          obj.print(list_copy);

          System.out.println("\n\n");
          number=obj.removeFirstPrint(number);





            //5-topshiiq
        System.out.println("\n\n Aralashmasdan oldin");
        obj.print(number);
        System.out.println("\nKeyingi hol");
        number=obj.almashtir(number);
        obj.print(number);

        ArrayList ss=new ArrayList(number);
        number=obj.sortDEC(number);
        obj.print(number);



    }
}
class Array_method
{
    LinkedList ss=new LinkedList();


    public LinkedList sortDEC(LinkedList list){
        Collections.sort(list);
        System.out.println("Saralanayotgan elementlar soni:" + list.size());
        return list;
    }





    public LinkedList  almashtir(LinkedList  list) {
        ss.clear();
        // Listni o'rtasidagi barcha elementlarni o'zgartirish
        for (int i = 0; i < list.size() / 2; i++) {
            ss.add(list.get(i));
            list.set(i,list.get(list.size()-1-i));
            list.set(list.size()-1-i,ss.getFirst());
            ss.clear();
        }
        return list;
    }
    public LinkedList removeFirstPrint(LinkedList list){
        list.removeFirst();
        print(list);
        return list;
    }





    public  LinkedList add2LinkedList(LinkedList a, LinkedList b){
        ss.clear();
        ss.addAll(a);
        ss.addAll(b);
        return ss;
    }
    public LinkedList removeAll(LinkedList list){
        list.clear();
        return list;
    }

    public LinkedList removeFirstLast(LinkedList list){
        System.out.println(list.getFirst());
        list.removeFirst();
        System.out.println(list.getLast());
        list.removeLast();
        return list;
    }



    public LinkedList removeIndex(LinkedList list, int a){
        list.remove(a);
        return list;
    }



    public  void getFirstLast(LinkedList list){
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }


    public  LinkedList  addFirsLast(LinkedList list, String a, String b){
        list.addFirst(a);
        list.addLast(b);
        return list;
    }
    public  void teskariChiqarish(LinkedList list) {
        // ListIterator orqali LinkedListni oxiridan boshlab oldinga qadam bilan yurish
        ListIterator iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }


    public LinkedList sizeDelete(LinkedList list){
        System.out.println(list.size());
        list.clear();
        return list;
    }



    public void print(LinkedList list){
        list.forEach(item->{
            System.out.println(item);
        });
    }


}
