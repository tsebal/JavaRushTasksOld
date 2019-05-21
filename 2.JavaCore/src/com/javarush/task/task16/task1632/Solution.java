package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new LoopThread("LoopThread"));
        threads.add(new InterruptedThread("InterruptedThread"));
        threads.add(new HoorayThread("HoorayThread"));
        threads.add(new MessageThread("MessageThread"));
        threads.add(new SumThread("SumThread"));
    }

    public static void main(String[] args) {

    }

    public static class LoopThread extends Thread {
        public LoopThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class InterruptedThread extends Thread {
        public InterruptedThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                while (!isInterrupted()) {

                }
                throw new InterruptedException();
            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class HoorayThread extends Thread {
        public HoorayThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(500);
                    System.out.println("Ура");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class MessageThread extends Thread implements Message {
        public MessageThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }

        @Override
        public void showWarning() {
            interrupt();
            try {
                join();
            }
            catch (InterruptedException e) {

            }
        }
    }

    public static class SumThread extends Thread {
        public SumThread(String name) {
            super(name);
        }

        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer sum = 0;
            try {
                while (true) {
                    String s = reader.readLine();
                    try {
                        sum += Integer.parseInt(s);
                    } catch (Exception e) {
                        if ("N".equals(s))
                            break;
                    }
                }
                System.out.println(sum);
            } catch (IOException e) {
            }
        }
    }
}