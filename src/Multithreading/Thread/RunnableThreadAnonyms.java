package Multithreading.Thread;

public class RunnableThreadAnonyms {
    public static void main(String[] args) throws Exception {
        
        Thread t1=new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("Hi");
                    try{Thread.sleep(1000);}catch(Exception e){}
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("Hello");
                    try{Thread.sleep(1000);}catch(Exception e){}
                }
            }
        };
       System.out.println(t1.getName());
       System.out.println(t2.getName());
        t1.start();
        t2.start();
        t1.join();
        System.out.println("Bye");
        t2.join();

    }
}
