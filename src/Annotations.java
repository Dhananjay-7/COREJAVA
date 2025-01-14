import java.util.Optional;

class A {
    public void ShowDataWhichBelongsToThisClass(){
        System.out.println("This is class A");
    }
}

class B extends A{
    @Override
    public void ShowDataWhichBelongsToThisClass(){
        System.out.println("This is class B");
    }
}


public class Annotations {
    public static void main(String[] args) {
        // B obj = new B();
        // obj.ShowDataWhichBelongsToThisClass();
        String str=null;

       Optional<String> string= Optional.ofNullable(str);
         System.out.println(string.isPresent());

        
    }
}
