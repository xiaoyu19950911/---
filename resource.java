package com.springbootaop.aop.test;

/**
 * @Author: xiaoyu
 * @Descripstion:
 * @Date:Created in 2018/1/30 14:52
 * @Modified By:
 */
public class resource {

    private Integer number=0;

    private boolean flag=false;

    public synchronized void create() throws InterruptedException {
        if(number==100){
            wait();//阻塞
            System.out.println("无法继续生产！");
        }else {
            number++;
            System.out.println(Thread.currentThread().getName()+"生产了一个产品，目前总数为"+number);
            notify();//唤醒
        }

    }

    public synchronized void del() throws InterruptedException {
        if (number==0){
            wait();
            System.out.println("剩余不足，无法继续消费！");
        }else {
            number--;
            System.out.println(Thread.currentThread().getName()+"消费了一个产品，目前总数为"+number);
            notify();
        }
    }
}
