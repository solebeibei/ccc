package DP.mediatorDP;

/**
 *
 * 中介模式~~
 * Created by liyang21 on 2016/9/11.
 */
public class Client {
    public static void main(String[] args) {
        Colleague colleagueA=new ColleagueA();
        Colleague colleagueB=new ColleagueB();
        AbstractMediator abstractMediator=new ConcreteMediator(colleagueA,colleagueB);
        colleagueA.setNumber(8,abstractMediator);
        System.out.println(colleagueA.getNumber());
        System.out.println(colleagueB.getNumber());
        //
        colleagueB.setNumber(100,abstractMediator);
        System.out.println(colleagueA.getNumber());
        System.out.println(colleagueB.getNumber());
    }
}
