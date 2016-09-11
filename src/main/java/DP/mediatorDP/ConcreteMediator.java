package DP.mediatorDP;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class ConcreteMediator extends AbstractMediator {

    public ConcreteMediator(Colleague a, Colleague b) {
        super(a, b);
    }

    @Override
    protected void aThenb() {
        int data = A.getNumber();
        B.setNumber(data * 10);
    }

    @Override
    protected void bThena() {
        int data = B.getNumber();
        A.setNumber(data+10);
    }
}
