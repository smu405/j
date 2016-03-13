package headfirst.singleton.jslSync;

public class SyncMain {
    public static void main(String[] args){
        myThread t = new myThread();
        t.start();
 
        synchronized(t){
            try{
                System.out.println("Waiting for myThread to complete...");
                t.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("sum: " + t.sum);
        }
    }
}
 
class myThread extends Thread{
    int sum;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                sum += i;
            }
            notify();
        }
    }
}

