package com.lxy.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
        HashSet<Object> objects = new HashSet<>();
        Map<String,Object> map= new HashMap<>();
    }
}


