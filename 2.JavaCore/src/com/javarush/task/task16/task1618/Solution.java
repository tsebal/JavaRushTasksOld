package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread testThread = new TestThread();
        testThread.start();
        Thread.sleep(1000);
        testThread.interrupt();
    }

    public static class TestThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("testing thread");
                if (isInterrupted())
                    break;
            }
        }
    }
}