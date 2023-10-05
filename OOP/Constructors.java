
class A {

    public A() {
        System.out.println("A class");
    }
}

class B extends A {

    public B() {
        // by default super() for calling the A class constructor first
        System.out.println("B class constructor 1.");
    }
}
public class Constructors {

    public static void main(String[] args) {
        new B();
    }
}
