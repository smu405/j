/*
 * @author jsl
 * @version 20151026
 * edit internet version
 * Each thread has its own stack with its own copy of variables.
 * When the thread is created, it copies the value of all accessible
 * variables in its own memory.
 * The volatile force the thread to update the original variable for each variable.
 * Without this keyword the JVM never refreshes those local copies in some threads. 
 */

package headfirst.singleton.jslVolatile;

public class VolatileMain {
    private static volatile int shared = 0;

    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
    }

    static class ThreadA extends Thread {
        public void run() {
            int ACopyShared = shared;
            while ( ACopyShared < 10){
                if( ACopyShared != shared){
                    System.out.println("A: refreshing "+Integer.toString(shared)+" from "+Integer.toString(ACopyShared));
                    ACopyShared = shared;
                }
            }
        }
    }

    static class ThreadB extends Thread {
        public void run() {
            while (shared < 10){
                System.out.println("B: set to "+Integer.toString(++shared));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}

