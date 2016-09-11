package DP.prototypeDP.prototypeManager;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Prototype p1 = new PrototypeA();
        PrototypeManager.setPrototype("p1", p1);
        System.out.println(PrototypeManager.getPrototype("p1").myClone());
        Prototype p2=new PrototypeB();
        PrototypeManager.setPrototype("p1",p2);
        System.out.println(PrototypeManager.getPrototype("p1").myClone());
        PrototypeManager.removePrototype("p1");
        System.out.println(PrototypeManager.getPrototype("p1").myClone());
    }
}
