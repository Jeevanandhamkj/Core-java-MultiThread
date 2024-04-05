package multithread;
//mt cready by imple by runnable
public class CreateThreadRunnable {
    public static void main(String[] args) {
        sachin st=new sachin();
        Thread t=new Thread(st);
        t.start();
        for(int z=4;z<=5;z++){
            System.out.println("main"+z);
        }

    }
}
class sachin implements Runnable{

    @Override
    public void run() {
        try{
            for(int k=2;k<=5;k++){
                System.out.println("sachin"+k);
            }
        }catch (Exception ek){
            System.out.println(ek);
        }
    }
}