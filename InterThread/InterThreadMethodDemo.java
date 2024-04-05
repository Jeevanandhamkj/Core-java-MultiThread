package multithread.InterThread;

public class InterThreadMethodDemo {
    public static void main(String[] args) {
        kj k=new kj();
        jk j=new jk();
        Ab b=new Ab();
        k.start();j.start();b.start();

    }
}
class kj extends Thread{
    @Override
    public void run() {
        fun();
    }

    public synchronized void fun(){
        try{
            Thread t=Thread.currentThread();
            for(int i=1;i<=5;i++){
                Thread.sleep(1000);
                this.wait(100);
                System.out.println(t.getName()+":"+"thread i="+i);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class jk extends Thread {
    @Override
    public void run() {
        fun();
    }

    public synchronized void fun() {
        try {
            Thread t = Thread.currentThread();
            for (int j = 1; j <= 5; j++) {
this.wait(50); //wait until call notify
                System.out.println(t.getName() +":"+ "thread j=" + j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    class Ab extends Thread{
        @Override
        public void run() {

            fun();
        }

        public synchronized void fun(){
            try{
                Thread t=Thread.currentThread();
                for(int z=1;z<=5;z++){

                    System.out.println(t.getName()+":"+"thread z"+z);
                }
                notifyAll();
            }catch (Exception e){
                e.printStackTrace();
            }
    }

}


