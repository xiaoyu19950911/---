package com.springbootaop.aop.test;

/**
 * @Author: xiaoyu
 * @Descripstion:
 * @Date:Created in 2018/1/30 14:51
 * @Modified By:
 */
public class producer implements Runnable {

    private resource resources;

    public producer(resource resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        while (true) {
            try {
                resources.create();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
