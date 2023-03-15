package Exam1;

public class YZLRunnable {
    public static void main(String[] args) {
        RunPrint run1 = new RunPrint();
        Thread thread = new Thread(run1);
        thread.start();
        for (int i = 1; i <=100  ; i++) {
            System.out.println("Main count "+i+" print: main");
        }
    }
}

class RunPrint implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread count "+i+" print: new");
        }
    }
}