package chapter12;

public class filec12e6 {
    public static void main(String[] args) {
        TicketWindow tw = new TicketWindow();
        new Thread(tw,"Window 1").start();
        new Thread(tw,"Window 2").start();
    }
    private static class TicketWindow extends Thread{
        private int tickets = 100;

        @Override
        public void run() {
            while (tickets>0){
                Thread th = Thread.currentThread();
                String th_name = th.getName();
                System.out.println(th_name+ "Saleing tickets: "+ tickets--);
            }
        }
    }
}
