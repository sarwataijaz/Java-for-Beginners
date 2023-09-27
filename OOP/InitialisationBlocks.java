/* by running this program, we get to know how the code in initialization block
 executes right after the creation of object. This comes before the statements/code present
 in the constructor.
 */
class Example {

    private int x;
    private static int y;

    {
        System.out.println("Area of square is: ");
        x = 5; // default value
    }

    public Example() {
        System.out.println(x*x);
    }

    static {
        System.out.println("Value of y: " + y);
        y = 2;
        System.out.println("Value of y now: " + y);
    }
}

public class InitialisationBlocks {

    public static void main(String[] args) {

        Example ex1 = new Example();
        Example ex2 = new Example();

        // instance initialization blocks will keep executing depending on the no: of new objects
        // static initialization blocks will execute only once regardless of new objects.
        // static initialization blocks are executed as soon as class is loaded by the classloader
        /* In Java, a classloader is a part of the Java Runtime Environment (JRE) that loads classes (compiled Java bytecode)
        into memory as they are needed by a Java program. */
    }
}
