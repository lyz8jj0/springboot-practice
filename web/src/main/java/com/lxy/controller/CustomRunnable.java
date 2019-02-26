package com.lxy.controller;

public class CustomRunnable implements Runnable {

    private int ticket = 10;

    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {
            if (this.ticket > 0) {
//                try {
//                    Thread.sleep(500);// 睡眠0.5秒  不至于运行太快
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + "卖票--->" + (this.ticket--));
            }
        }
    }

    public static void main(String[] args) {

        CustomRunnable cr = new CustomRunnable();

        Thread t1 = new Thread(cr, "一号窗口");
        Thread t2 = new Thread(cr, "二号窗口");
        Thread t3 = new Thread(cr, "三号窗口");

        t1.start();
        t2.start();
        t3.start();
    }
}
