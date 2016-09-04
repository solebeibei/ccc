package bean;

/**
 * Created by liyang21 on 2016/9/3.
 */
public class User {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    public void print(){
        System.out.println("The name,"+name+"The age,"+age);
    }
}
