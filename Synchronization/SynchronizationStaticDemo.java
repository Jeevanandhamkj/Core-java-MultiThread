package multithread.Synchronization;

public class SynchronizationStaticDemo extends Thread{
    synchronized static void view(){
        try{
            for(int i=1;i<=5;i++){
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"="+i);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
class Y extends Thread{
    @Override
    public void run() {
        SynchronizationStaticDemo.view();
    }
}
class Z extends Thread{
    @Override
    public void run() {
        SynchronizationStaticDemo.view();
    }
}
class ipl{
    public static void main(String[] args) {
        SynchronizationStaticDemo sb=new SynchronizationStaticDemo();
      Y y=new Y();
      Z z=new Z();
      sb.start();y.start();z.start();

    }
}