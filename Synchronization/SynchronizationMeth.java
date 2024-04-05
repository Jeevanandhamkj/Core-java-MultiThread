package multithread.Synchronization;

public class SynchronizationMeth extends Thread{
    public synchronized void meth(){
        try{
            Thread t=Thread.currentThread();
            for(int i=1;i<5;i++){
            Thread.sleep(1000);
                System.out.println(t.getName()+"="+i);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class A extends Thread{
    SynchronizationMeth sm;
    A(SynchronizationMeth sm){
        this.sm=sm;
    }

    @Override
    public void run() {
        sm.meth();
    }
}
class B extends Thread{
    SynchronizationMeth sm;
    B(SynchronizationMeth sm){
        this.sm=sm;
    }

    @Override
    public void run() {
        sm.meth();
    }
}
class mainfun {
    public static void main(String[] args) {
        SynchronizationMeth s=new SynchronizationMeth();
        A a=new A(s);
        B b=new B(s);
        s.start();
        a.start();
        b.start();
    }
}