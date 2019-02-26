package com.lxy.controller;

public class CustomThread extends Thread {

    private int ticket = 10;

    private String name;

    public CustomThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {
            if (this.ticket > 0) {
                System.out.println(this.name + "卖票--->" + (this.ticket--));
            }
        }

    }

    public static void main(String[] args) {

        CustomThread t1 = new CustomThread("一号窗口");
        CustomThread t2 = new CustomThread("二号窗口");
        CustomThread t3 = new CustomThread("三号窗口");

        t1.start();
        t2.start();
        t3.start();
    }

}
