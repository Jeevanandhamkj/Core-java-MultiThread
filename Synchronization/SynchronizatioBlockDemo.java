package multithread.Synchronization;

public class SynchronizatioBlockDemo extends Thread{
    public void jeeva() {
        synchronized (this) { //block
            try {
                Thread tt = Thread.currentThread();
                for (int i = 1; i < 5; i++) {
                    Thread.sleep(2000);
                    System.out.println(tt.getName() + "=" + i);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class C extends Thread{
    SynchronizatioBlockDemo sb;
    C(SynchronizatioBlockDemo sb){
        this.sb=sb;
    }

    @Override
    public void run() {
        sb.jeeva();
    }
}
class D extends Thread{
    SynchronizatioBlockDemo sb;
    D(SynchronizatioBlockDemo sb){
        this.sb=sb;
    }

    @Override
    public void run() {
        sb.jeeva();
    }
}
class output{
    public static void main(String[] args) {
        SynchronizatioBlockDemo ssd=new SynchronizatioBlockDemo();
        C c=new C(ssd);
        D d=new D(ssd);
        ssd.start();
        c.start();
        d.start();
    }
}