package multithread;

public class ThreadJoin  {
    public static void main(String[] args) throws Exception {
        joinEx e=new joinEx();
        e.start();
        e.join();
        System.out.println("MainThread");
    }
}
class joinEx extends Thread{
    @Override
    public void run() {
        try{
            Thread.sleep(10000);
            System.out.println("JoinEx");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}