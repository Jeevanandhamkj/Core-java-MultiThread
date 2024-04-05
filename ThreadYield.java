package multithread;

public class ThreadYield {
    public static void main(String[] args) {
        kj j=new kj();
        j.start();
        jk k=new jk();
                k.start();
        for(int s=1;s<=5;s++){
            Thread.yield();
            System.out.println("main"+s);
        }
    }
}
class kj extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("kj"+i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class jk extends Thread{
    @Override
    public void run() {
        try{
            for(int z=1;z<=5;z++){
                System.out.println("jk"+z);
            }
        }catch (Exception e1){
            System.out.println( e1);
        }
    }
}