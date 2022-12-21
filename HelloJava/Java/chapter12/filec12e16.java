package chapter12;

public class filec12e16 {
    public static void main(String[] args) {
        Ticket1 tk1 = new Ticket1();
        new Thread(tk1,"Thread1 ").start();
        new Thread(tk1,"Thread2 ").start();
        new Thread(tk1,"Thread3 ").start();
    }

    private static class Ticket1 implements Runnable{
        private int tickets = 10;
        Object lock = new Object();

        @Override
        public void run() {
            while (true){
                synchronized (lock){
                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    if (tickets > 0){
                        System.out.println(Thread.currentThread().getName()+ "---ticket sell: "+tickets--);
                    }
                }
            }
        }
    }
}
