package com.cat.ThreadTest.Thread3;

import java.util.concurrent.Callable;

public class TestThread3 implements Callable {

    @Override
    public Integer call() throws Exception {
        int u = 0;
        for(int i = 1;i < 101;i++){
            u = u + i;
        }
        return u;
    }
}
