package DP.proxyDP;

/**
 * 代理模式~~
 * Created by liyang21 on 2016/9/11.
 */
public class MainTest {

    public static void main(String[] args) {
        LotteryFans lotteryFans=new LotteryFans(new lotteryShop());
        lotteryFans.buy();
        LotteryFans lotteryFans1=new LotteryFans(new lotteryOnline());
        lotteryFans1.buy();
    }
}
