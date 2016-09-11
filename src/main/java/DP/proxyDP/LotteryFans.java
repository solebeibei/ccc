package DP.proxyDP;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class LotteryFans {
    private lottery lottery;
    public LotteryFans(lottery lottery){
        this.lottery=lottery;
    }
    public  void  buy(){
        lottery.buyTicket();
    }
}
