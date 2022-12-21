package chapter12;

public class filec12e17 {
    public static void main(String[] args) {
        Ticket1 tk1 = new Ticket1();
        new Thread(tk1, "Thread1 ").start();
        new Thread(tk1, "Thread2 ").start();
        new Thread(tk1, "Thread3 ").start();
    }
}
    class Ticket1 implements Runnable {
        private int tickets = 10;

        @Override
        public void run() {
            while (true){
                saleTicket();
                if (tickets <= 0){
                    break;
                }
            }
        }

        private synchronized void saleTicket() {
            if (tickets >0){
                try{
                    Thread.sleep(300);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+ "---ticket Sold"+ tickets--);
            }
        }
    }