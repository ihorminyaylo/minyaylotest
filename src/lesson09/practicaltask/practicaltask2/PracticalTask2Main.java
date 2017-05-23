package lesson09.practicaltask.practicaltask2;

/**
 * Created by user on 23.05.2017.
 */
public class PracticalTask2Main {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < count; i++) {
                    System.out.println("Hello world");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < count; i++) {
                    System.out.println("Peace in the peace");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("My name is Gosha");
    }
}
