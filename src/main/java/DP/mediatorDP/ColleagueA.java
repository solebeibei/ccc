package DP.mediatorDP;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class ColleagueA extends Colleague {
    @Override
    protected void setNumber(int number, AbstractMediator abstractMediator) {
        this.number=number;
        abstractMediator.aThenb();
    }
}
