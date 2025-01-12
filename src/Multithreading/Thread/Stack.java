package Multithreading.Thread;

public class Stack{
   private int[] stack;
    private int stackTop;
    Object lock = new Object();

    public Stack(int size){
        stack = new int[size];
        stackTop = -1;
    }

    public boolean push(int value){
       synchronized (lock) {
        if(isFull()){
            return false;
        }
        try{Thread.sleep(1000);}catch(Exception e){}

        stack[++stackTop] = value;
        return true;
       }
    }

    public  int pop(){
        synchronized (lock) {
            if(isEmpty()){
                return -1;
            }
            try{Thread.sleep(1000);}catch(Exception e){}
            return stack[stackTop--];
            
        }
    }

    public boolean isEmpty(){
        return stackTop<0;
    }

    public boolean isFull(){
        return stackTop>=stack.length-1;
    }

}
