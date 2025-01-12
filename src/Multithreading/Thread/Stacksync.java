    package Multithreading.Thread;

    public class Stacksync{
    private static int[] stack;
        private static int stackTop;
            Object lock = new Object();
        
            public Stacksync(int size){
                stack = new int[size];
                stackTop = -1;
            }
        
            public static synchronized  boolean push(int value){
                if(isFull()){
                            return false;
                        }
                        try{Thread.sleep(1000);}catch(Exception e){}
                
                        stack[++stackTop] = value;
                        return true;
                    }
                
                    public synchronized int pop(){
                        if(isEmpty()){
                            return -1;
                        }
                        try{Thread.sleep(1000);}catch(Exception e){}
                        return stack[stackTop--];
                    }
                
                    public boolean isEmpty(){
                        return stackTop<0;
                    }
                
                    public static boolean isFull(){
                return stackTop>=stack.length-1;
        }

    }