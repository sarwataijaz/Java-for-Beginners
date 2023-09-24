// learning to import another class from different package
package pack1;
import pack2.Student; // importing the particular class, will use '*' if we want to import more than one class
public class Examplr {

    public static void main(String[] args) {
        Student s1 = new Student(24, "Sarwat");

        System.out.println("Student name: " + s1.getName());
        System.out.println("Student roll number 22SW0" + s1.getNum());
    }
}
