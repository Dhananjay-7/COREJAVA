package Abstraction;

public class Son extends Parent {
    @Override
    void carrier(String name) {
        System.out.println("My carrier is " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("My partner is " + name + " and she is " + age + " years old");
    }

}
