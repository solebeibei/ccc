package DP.prototypeDP.prototypeManager;

/**
 * Created by liyang21 on 2016/9/11.
 */
public interface Prototype {
    public Prototype myClone();
    public String getName();
    public void setName(String name);
}
