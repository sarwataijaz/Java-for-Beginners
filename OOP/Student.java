// public -> can be accessed within or outside of the package
// no access modifier -> default -> can be accessed only inside of that package
// private -> cannot be accessed within its own package even

package pack2;
public class Student {

    private int rollnum;
    private String name;

   public Student(int r, String n) {
        rollnum = r;
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return rollnum;
    }

    public static void main(String[] args) {


    }
}
