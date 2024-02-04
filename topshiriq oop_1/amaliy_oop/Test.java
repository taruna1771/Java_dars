package amaliy_oop;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("Jahongir","Sirdaryo viloyati","Til o'rganish",2003,20);
        System.out.println(student.getName());
        student.setAddres("Ma'rifat 33-uy");
        System.out.println(student.toString());



        Staff staff=new Staff("Anvar","Yashnobod tumani 22-uy","3-maktab",1000);
        System.out.println(staff.getName());
        System.out.println(staff.getAddres());
        System.out.println(staff.getPay());
        staff.setPay(2000);
        System.out.println(staff.toString());
    }
}
