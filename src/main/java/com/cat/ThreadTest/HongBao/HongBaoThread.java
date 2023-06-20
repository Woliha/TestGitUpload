package com.cat.ThreadTest.HongBao;

import com.cat.Annotion.Student;

import java.util.Random;

public class HongBaoThread extends Thread{

    //红包的总金额
    public static double maxMoney = 100.00;
    //红包最小的金额
    public static double MIN = 0.01;
    //红包的数量
    public static int amount = 3;

    public static Random random = new Random();

    public HongBaoThread() {

    }

    public static Student student = new Student();
    @Override
    public void run() {
            synchronized (student){
                //如果红包数量没有了，就退出
                if(amount == 0){
                    System.out.println(this.getName()+ "没有抢到红包:");
                }
                //如果红包数量为1个，则把剩余的全部金额都送出去
                else if(amount == 1){
                    System.out.println(this.getName()+ "--获得红包:" + maxMoney);
                    maxMoney = 0;
                    amount--;
                }
                //如过红包数量大于1个，则随机一个红包金额，送出去，然后总金额减少
                else if(amount > 1){
                    maxMoney = maxMoney * 100;
                    int price = (int)maxMoney;

                    int reduceprice = random.nextInt((price - 1 * (amount - 1)));
                    if (reduceprice <= 1){
                        reduceprice = 1;
                    }
                    maxMoney = maxMoney - reduceprice;
                    maxMoney = maxMoney / 100;
                    double douprice = reduceprice;
                    douprice = douprice / 100;
                    System.out.println(this.getName()+ "获得红包:" + douprice);
                    amount--;
                }
            }

    }
}
