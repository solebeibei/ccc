package DP.prototypeDP;

/**原型模式~~~
 *
 * Created by liyang21 on 2016/9/11.
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype myClone() {
        return  prototype.myClone();
    }

    public static void main(String[] args) {
        Client client = new Client(new PrototypeA());
        System.out.println(client.myClone().toString());
        Client client2 = new Client(new PrototypeB());
        System.out.println(client2.myClone().toString());
    }
}
