package oop;


public interface Information {
    void getInfo();
    void getTeamName();
    public static void main(String[] args) {
 Footbalplayer footbalplayer=new GoalKeeper();
 footbalplayer.getInfo();

    }
}

class Player implements Information{

    String nameOfPlayer, sportType, teamName;
    int numberPosition;

    @Override
    public void getInfo() {

        System.out.println("O'yinchi ismi: "+nameOfPlayer);
        System.out.println("Sport turi:"+sportType);
        System.out.println("Sportchi raqami: "+numberPosition);
    }
    void ss(){

    }

    @Override
    public void getTeamName() {
        System.out.println("Jamoa nomi: "+teamName);
    }
}

// 2-qobiq

class Footbalplayer extends Player{


    int countOfRedCard, countOfYellowCard, countOfGoals;

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Qizil kartochkalar soni: "+countOfRedCard);
        System.out.println("Sariq kartochkalar soni: "+countOfYellowCard);
        System.out.println("Urgan gollar soni: "+countOfGoals);
    }
}

class GoalKeeper extends Footbalplayer{
    int countOfSaves;
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Saqlandi: "+countOfSaves);
    }
}


// valeybolga
class Volleyballplayer extends Player{
    int numberOfPoints;

}
class Setter extends Volleyballplayer{
    int countOfSets;
}


//basketbol
class Basketballplayer extends Player{
    int numberOfGoals;
}
class Pointguard extends Basketballplayer{
    int countOfGuard;
}
