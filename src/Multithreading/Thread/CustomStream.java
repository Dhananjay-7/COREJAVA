package Multithreading.Thread;

import java.util.Arrays;
import java.util.List;

public class CustomStream {
    public static void main(String[] args) {
        
      List<Integer> list=Arrays.asList(1,2,3,4,5);

      int result=list.stream()
                  .filter(n -> n%2==1)
                  .sorted()
                  .map(n -> n*2)
                  .reduce(0, (n1,n2) -> n1+n2);

      System.out.println(result+"->list data after stream");
                  

      // Stream<Integer> stream = list.stream();

      // stream.forEach(System.out::println);
      // stream.forEach(System.out::println);


      



      
    }
}
