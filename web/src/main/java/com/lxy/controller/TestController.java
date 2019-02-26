package com.lxy.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class TestController implements Runnable {


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestController mt = new TestController();

    }
}


