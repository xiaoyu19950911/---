package com.springbootaop.aop.test;

/**
 * @Author: xiaoyu
 * @Descripstion:
 * @Date:Created in 2018/1/30 14:08
 * @Modified By:
 */
public class RunnableStudy{

    public static void main(String[] args){
        resource resources=new resource();
        producer producers=new producer(resources);
        customer customers=new customer(resources);
        Thread pro1=new Thread(producers,"生产者1");
        Thread pro2=new Thread(producers,"生产者2");
        Thread pro3=new Thread(producers,"生产者3");
        Thread cus1=new Thread(customers,"消费者1");
        Thread cus2=new Thread(customers,"消费者2");
        Thread cus3=new Thread(customers,"消费者3");
        pro1.start();
        pro2.start();
        pro3.start();
        cus1.start();
        cus2.start();
        cus3.start();
    }

}
