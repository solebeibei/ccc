package DP.brigeDP;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class OpenBoxImage implements  Image {
    private  Color color;

    @Override
    public void paint(Color color) {
        System.out.println("OpenBoxImage with:"+color.getColor());
    }
}
