
class A {

    public A() {
        System.out.println("A class");
    }
}

class B extends A {

    public B() {
        this(4); // now super wont be given by compiler as only one of the keywords i.e this/super can exist at a time
        System.out.println("B class constructor 1.");
    }


    public B(int k) {
        // this will first call the constructor of parent class by default super keyword
        System.out.println("B class constructor 2.");
    }
}
public class Constructors {

    public static void main(String[] args) {
        new B(); // constructor without parameter (default constructor) will be called
    }
}
