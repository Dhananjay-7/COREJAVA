package Multithreading.Thread;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        // MultiThreadingSync.main(args);
        // MainThread.main(args);
        // Stack.main(args);

        Stack stack = new Stack(5);
        new Thread(()->{
            int counter =0;
            while(++counter<10){
                System.out.println("pushed"+ stack.push(counter));
            }
        }).start();

        

        new Thread(()->{
            int counter=0;
            while(++counter<10){
                System.out.println("popped"+ stack.pop());
            }
        },"popper").start();

        System.out.println("Main thread");
    }
}
