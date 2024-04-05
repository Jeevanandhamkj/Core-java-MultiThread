package multithread;

public class OddOrEven {
    public static void main(String[] args) {
        Task t=new Task();
        Tk te=new Tk();
        Thread tt=new Thread(te);
        t.start();
        tt.start();



    }
}
class Task extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("evennumber is=" + i);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
    class Tk implements Runnable{
        public void run(){
            try{
                for(int j=1;j<=10;j++){
                    if(j%2==1){
                        System.out.println("odd number is="+j);
                    }
                }
            }catch (Exception ek){
                System.out.println(ek);
            }
        }
    }
