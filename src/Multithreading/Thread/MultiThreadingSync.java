package Multithreading.Thread;

class Increment{
    int count = 0;
    public  synchronized void increment(){
        count++;
    }
}

public class MultiThreadingSync {
    public static void main(String[] args) throws Exception {
        Increment obj=new Increment();

        Thread t1=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<1000;i++){
                    obj.increment();
                }
            }
        });

        Thread t2=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<1000;i++){
                    obj.increment();
                }
            }
        });


        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(obj.count);

    }
}
