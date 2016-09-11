package DP.prototypeDP.prototypeManager;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class PrototypeA implements Prototype {
    @Override
    public Prototype myClone() {
        Prototype prototype=new PrototypeA();
        prototype.setName("PrototypeA");
        return prototype;
    }
    public  String toString(){
        return "PrototypeA:";
    }
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
