package DP.prototypeDP.prototypeManager;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class PrototypeB implements Prototype {
    private  String name;
    @Override
    public Prototype myClone() {
        Prototype prototype=new PrototypeB();
        prototype.setName("PrototypeB");
        return prototype;
    }
    public  String toString(){
        return "PrototypeB:";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
