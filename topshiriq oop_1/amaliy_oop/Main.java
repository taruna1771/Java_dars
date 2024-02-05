package amaliy_oop;

public class Main {
    public static void main(String[] args) {
        //Eslatma yaroqlilik degan boolen olganman sababi soat natogri kiritilganda metodlar ishlamasligi kerak
        // Bu mening shaxsiy fikrim o'ylaymanki masalaga yaxshi yondashganman:)
        MyTime myTime=new MyTime();
        myTime.setTime(0,0,0);
        myTime.previousSecond();
        System.out.println(myTime.toString());
        myTime.setHours(21);
        myTime.setMinute(44);
        myTime.nextMinut();
        System.out.println(myTime.toString());


    }
}
class MyTime {
    private int hours, minute, second;
boolean yaroqlilik=true;
    public MyTime(){}
    public MyTime(int hours, int minute, int second) {
        this.hours = hours;
        this.minute = minute;
        this.second = second;
        yaroqlilik=true;
    }
    public void setTime(int hours, int minute, int second){
        boolean tek=true;
        if(!(hours>=0&&hours<24)){tek=false;}
        if(!(minute>=0&&minute<60)){tek=false;}
        if(!(second>=0&&second<60)){tek=false;}
        if(tek){
            this.hours = hours;
            this.minute = minute;
            this.second = second;
            yaroqlilik=true;
        }
        else {
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
            yaroqlilik=false;
        }
    }
    void setHours(int hours){
        if(hours>=0&&hours<24){
            this.hours=hours;
            yaroqlilik=true;
        }
        else {
            System.out.println("Bunday soat mavjud emas!");
            yaroqlilik=false;
        }
    }
    void setMinute(int minute){
        if(minute>=0&&minute<60){
            this.minute=minute;
            yaroqlilik=true;
        }
        else {
            System.out.println("Bunday minut mavjud emas!");
            yaroqlilik=false;
        }
    }
    void setSecond(int second){
        if(second>=0&&second<60){
            this.second=second;
            yaroqlilik=true;
        }
        else {
            System.out.println("Bunday daqiqa mavjud emas!");
            yaroqlilik=false;
        }
    }

    //getterlar

    int getHours(){
        if(yaroqlilik){
            return this.hours;
        }
        else {
            System.out.println("Yaroqsiz vaqt!");
        }
        return 0;

    }
    int getMinute(){
        if(yaroqlilik){
            return this.minute;
        }
        else {
            System.out.println("Yaroqsiz vaqt!");
        }
        return 0;
    }
    int getSecond(){
        if(yaroqlilik){
            return this.second;
        }
        else {
            System.out.println("Yaroqsiz vaqt!");
        }
        return 0;
    }

    // ma'lumot chiqarish
    public String toString(){
        if(yaroqlilik){
            String h,m,s;
            h=(hours<10)?"0"+Integer.toString(hours):Integer.toString(hours);
            //m
            m=(minute<10)?"0"+Integer.toString(minute):Integer.toString(minute);
            //s
            s=(second<10)?"0"+Integer.toString(second):Integer.toString(second);
            return h+":"+m+":"+s;
        }
        else {
            System.out.println("Yaroqsiz vaqt!");
        }
        return "";

    }

    public void nextSecond(){
        if(yaroqlilik){
            second++;
            if(second>=60) {second=0;minute++;}
            if(minute>=60) {minute=0;hours++;}
            if(hours>=24)  {hours=0;}
        }
        else {
            System.out.println("Yaroqsiz vaqt!");
        }

    }
    public void nextMinut(){
        if(yaroqlilik){
            minute++;
            if(minute>=60) {minute=0;hours++;}
            if(hours>=24)  {hours=0;}
        }
        else {
            System.out.println("Yaroqsiz vaqt!");
        }

    }
    public void nextHours(){
        if(yaroqlilik){
            hours++;
            if(hours>=24)  {hours=0;}
        }
        else {
            System.out.println("Yaroqsiz vaqt!");
        }

    }
    // oldinga qaytarish
    public void previousSecond(){
        if(yaroqlilik){
            second--;
            if(second<0){ minute--; second=59;}
            if(minute<0){ hours--;  minute=59;}
            if(hours<0) {hours=23;}
        }
        else {
            System.out.println("Yaroqsiz vaqt!");
        }

    }
    public void previousMinute(){
        if(yaroqlilik){
            minute--;
            if(minute<0){ hours--;  minute=59;}
            if(hours<0) {hours=23;}
        }
        else {
            System.out.println("Yaroqsiz vaqt!");
        }

    }
    public void previousHours(){
        if(yaroqlilik){
            hours--;
            if(hours<0) {hours=23;}
        }
        else {
            System.out.println("Yaroqsiz vaqt!");
        }

    }
}
