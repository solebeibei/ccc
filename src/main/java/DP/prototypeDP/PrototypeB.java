package DP.prototypeDP;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class PrototypeB implements  Prototype {
    @Override
    public Prototype myClone() {
        return new PrototypeB();
    }
    public  String toString(){
        return "PrototypeB:";
    }
}
