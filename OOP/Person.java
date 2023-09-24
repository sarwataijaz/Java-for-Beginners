// concept of single inheritance in java
public class Person {

    private int age;
    private String name;

    void setName(String s) {
        name = s;
    }

    void setAge(int n) {
        age = n;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

class Student extends Person {

    private String rollnum;
    private int batch;

    void setRollnum(String r) {
        rollnum = r;
    }

    void setBatch(int b) {
        batch = b;
    }

    String getRollnum() {
        return rollnum;
    }

    int getBatch() {
        return batch;
    }
}

class Example {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Sarwat");
        s1.setRollnum("22SW024");
        s1.setBatch(22);

        System.out.println("Name: " + s1.getName());
        System.out.println("Roll number: " + s1.getRollnum());
        System.out.println("Batch: " + s1.getBatch());
    }
}