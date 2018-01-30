package com.springbootaop.aop.test;

/**
 * @Author: xiaoyu
 * @Descripstion:
 * @Date:Created in 2018/1/30 14:51
 * @Modified By:
 */
public class customer implements Runnable {

    private resource resources;

    public customer(resource resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        while (true) {
            try {
                resources.del();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
