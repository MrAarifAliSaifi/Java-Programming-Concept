package com.company;
class Mythreds extends Thread {
    public void run() {
        int i = 0;
        while (i != 400) {
            System.out.println("I ma ble to add two number at a time");
            i++;

        }
    }
}

    class Mythreads2 extends Thread {
        public void run() {
            int i = 0;
            while (i < 400) {
                System.out.println("i am able to subtract two number at a time");
                i++;
            }
        }
    }

    public class Threading {
        public static void main(String[] args) {
            Mythreds th = new Mythreds();
            Mythreads2 th2 = new Mythreads2();
            th.start();
            th2.start();
        }
    }

