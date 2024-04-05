package multithread;

import static java.lang.Thread.*;

public class ThreadSleep {
    public static void main(String[] args) {
        Sleeping s1 = new Sleeping();
        Sleeping1 s2 = new Sleeping1();
        Sleeping2 s3 = new Sleeping2();
        s1.start();
        s2.start();
        s3.start();

    }}

    class Sleeping extends Thread {
        @Override
        public void run() {
            try {
                sleep(3000);
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Sleeping" + i);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    class Sleeping1 extends Thread {
        @Override
        public void run() {
            try {

                sleep(2000);
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Sleeping==1==" + i);

                }
            } catch (Exception k) {
                System.out.println(k);
            }
        }
    }

    class Sleeping2 extends Thread {
        @Override
        public void run() {
            try {

                for (int i = 1; i <= 5; i++) {
                    System.out.println("Sleeping==2==" + i);

                }
            } catch (Exception k) {
                System.out.println(k);
            }
        }
    }



