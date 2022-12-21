package chapter12;
class SleepThread implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=8;i++){
            if (i==3){
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("SleepThread running: "+ i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class filec12e9 {
    public static void main(String[] args) throws Exception {
        new Thread(new SleepThread()).start();
        for (int i = 1;i<=8;i++){
            if(i==5){
                Thread.sleep(2000);
            }
            System.out.println("Main thread print: "+i);
            Thread.sleep(500);
        }
    }
}
