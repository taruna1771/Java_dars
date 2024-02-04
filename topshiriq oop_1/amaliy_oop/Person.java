package amaliy_oop;

public  class Person{
    String name;
    String addres;
    Person(){ }
    Person(String name, String addres){
        this.name=name;
        this.addres=addres;
    }
    String getName(){
        return this.name;
    }
    String getAddres(){
        return this.addres;
    }
    void setAddres(String addres){
        this.addres=addres;
    }
    public String toString() {
        return "Person[name=" + name + ", address=" + addres + "]";
    }



}


class Student extends Person{
     String program;
     int year;
     double fee;

    public Student(String program, int year, double fee) {
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public Student(String name, String addres, String program, int year, double fee) {
        super(name, addres);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    String getProgramm(){
        return program;
    }
    void setProgramm(String program){
        this.program=program;
    }
    int getYear(){
        return this.year;
    }
    void setYear(int year){
        this.year=year;
    }

    double getFee(){
        return this.fee;
    }

    void setFee(double fee){
        this.fee=fee;
    }
    public String toString(){
        return "Student[Person[name="+name+",address="+addres+"],"+"programm="+program+",year="+year+",fee="+fee+"]";
    }
}

class Staff extends Person{
    private String school;
    private  double pay;

    public Staff(String school, double pay) {
        this.school = school;
        this.pay = pay;
    }

    public Staff(String name, String addres, String school, double pay) {
        super(name, addres);
        this.school = school;
        this.pay = pay;
    }
   public String getSchool(){
        return this.school;
    }
    public void setSchool(String school){
        this.school=school;
    }
   public double getPay(){
        return this.pay;
    }
    public void setPay(double pay){
        this.pay=pay;
    }

    public String toString(){
       return  "Staff[Person=[name="+this.name+",address="+this.addres+"],school="+this.school+",pay="+this.pay+"]";
    }
}