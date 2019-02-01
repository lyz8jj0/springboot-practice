package com.lxy.controller;

public class ArraySort implements Runnable {

    private String num;

    @Override
    public void run() {
        try {
            Thread.sleep(Integer.parseInt(num));
            System.out.println(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ArraySort(int num) {
        this.num = num + "";
    }

    public static void main(String[] args) {
        //把这个数组升序输出
        int[] nums = {11, 3, 998, 5455, 1, 152, 990};
        for (int num1 : nums) {
            new Thread(new ArraySort(num1)).start();
        }
    }
}
