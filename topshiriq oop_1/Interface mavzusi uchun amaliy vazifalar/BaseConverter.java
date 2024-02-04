package oop;


public interface BaseConverter {
    double Convert(double temperature);

    public static void main(String[] args) {
        BaseConverter test1=new Kelvin();
        BaseConverter test2=new Farengeyt();

        System.out.println(test1.Convert(22));
        System.out.println(test2.Convert(22));
    }
}


class Kelvin implements BaseConverter{

    @Override
    public double Convert(double temperature) {
        return temperature+273.15;
    }
}

class Farengeyt implements BaseConverter{

    @Override
    public double Convert(double temperature) {
        return (9.0/5)*temperature+32;
    }
}
