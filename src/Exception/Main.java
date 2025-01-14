package Exception;

public class Main {
    public static void main(String[] args) throws Exception {
        int a=2;
        int b=0;

        try{
           
         Divide(a, b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally block");
        }
    }

    static int Divide(int a, int b) throws Exception{
        if(b==0){
            throw new Exception("please do not Divide by zero");
        }
        return a/b;
    }

}
