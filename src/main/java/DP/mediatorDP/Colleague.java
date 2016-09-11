package DP.mediatorDP;

/**
 * Created by liyang21 on 2016/9/11.
 */
public abstract class Colleague {
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    protected int number;

    protected abstract void setNumber(int number, AbstractMediator abstractMediator);

}
