package multithread;
// multithread create by extends by thread
public class CreatingThread {
    public static void main(String[] args) {

        for(int j=0;j<=5;j++){
            System.out.println("main"+j);
        }
        jeeva kj=new jeeva();
        kj.start();

    }
}
class jeeva extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0;i<=5;i++){
                System.out.println("jeeva"+i);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}