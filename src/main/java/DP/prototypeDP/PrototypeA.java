package DP.prototypeDP;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class PrototypeA implements  Prototype {
    @Override
    public Prototype myClone() {
        return new PrototypeA();
    }
    public  String toString(){
        return "PrototypeA:";
    }
}
