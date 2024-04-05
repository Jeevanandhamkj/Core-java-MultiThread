package multithread.Synchronization;
//synchronized in java control toaccess mthred to any share resouerce
public class SynchronizationDemo {
   // public  synchronized void  threadFunction(){ //synchronized method

    public void threadFunction(){
        synchronized (this){ //synchronized block
        Thread th=Thread.currentThread();
        try {
            for(int i=0;i<5;i++){
                Thread.sleep(2000);
                System.out.println(th.getName()+":"+i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}}
class Thread1 extends Thread{
    SynchronizationDemo sd;
    Thread1(SynchronizationDemo ob){
        this.sd=ob;
    }

    @Override
    public void run() {
        sd.threadFunction();
    }
}
class Thread2 extends Thread{
    SynchronizationDemo sb;
    Thread2(SynchronizationDemo val){
        this.sb=val;
    }

    @Override
    public void run() {
        sb.threadFunction();
    }
}
class Thread3 extends Thread{
    SynchronizationDemo sb;
    Thread3(SynchronizationDemo f){
        this.sb=f;
    }

    @Override
    public void run() {
        sb.threadFunction();
    }
}
class Main{
    public static void main(String[] args) {
        SynchronizationDemo ssb=new SynchronizationDemo();
        Thread1 t1=new Thread1(ssb);
        Thread2 t2=new Thread2(ssb);
        Thread3 t3=new Thread3(ssb);

        t1.start();
        t2.start();
        t3.start();
    }
}