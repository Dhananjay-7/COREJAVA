package Threads;

class JoinTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended: " + Thread.currentThread().getName());
    }

}

public class JoinThred {
    public static void main(String[] args) {

        Thread t1 = new Thread(new JoinTask(), "Thread 1");
        Thread t2 = new Thread(new JoinTask(), "Thread 2");
        Thread t3 = new Thread(new JoinTask(), "Thread 3");
        

       try{
        t1.start();
        System.out.println("Joining thread 1");
        t1.join();
        System.out.println("Thread 1 joined");
        t2.start();
        System.out.println("Joining thread 2");
        t2.join();
        System.out.println("Thread 2 joined");
        t3.start();
        System.out.println("Joining thread 3");
        t3.join();
        System.out.println("Thread 3 joined");
       }catch(InterruptedException e){
           e.printStackTrace();
       }
        
    }
}
