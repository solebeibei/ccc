package DP.proxyDP;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class lotteryOnline implements  lottery {
    private  lottery lottery;
    public  lotteryOnline(){
        this.lottery=new lotteryShop();
    }
    @Override
    public void buyTicket() {
        System.out.println("buy lottery online,and proxy for the below:");
        lottery.buyTicket();
    }
}
