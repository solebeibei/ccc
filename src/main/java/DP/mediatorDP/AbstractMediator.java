package DP.mediatorDP;

/**
 * Created by liyang21 on 2016/9/11.
 */
public abstract class AbstractMediator {
    protected Colleague A;
    protected  Colleague B;

    public AbstractMediator(Colleague a, Colleague b) {
        A = a;
        B = b;
    }
    protected abstract void aThenb();

    protected abstract void   bThena();
}
