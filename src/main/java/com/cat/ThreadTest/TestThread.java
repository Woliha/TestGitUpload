package com.cat.ThreadTest;

public class TestThread extends Thread{

    @Override
    public void run() {
        for(int i = 0;i < 1000;i++){
            System.out.println(this.getName() + "执行线程");
        }
    }
}
