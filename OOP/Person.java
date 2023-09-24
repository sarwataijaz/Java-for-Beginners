// concept of single and multilevel inheritance in java
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
    private int year;

    void setRollnum(String r) {
        rollnum = r;
    }

    void setYear(int b) {
        year = b;
    }

    String getRollnum() {
        return rollnum;
    }

    int getYear() {
        return year;
    }
}

class UniversityStudent extends Student {

    private int semester;
    private String uniName;

    void setUniName (String s) {
        uniName = s;
    }

    void setSemester(int n) {
        semester = n;
    }

    int getSemester() {
        return semester;
    }

    String getUniName() {
        return uniName;
    }
}

class Example {

    public static void main(String[] args) {

        UniversityStudent s1 = new UniversityStudent();
        s1.setName("Sarwat");
        s1.setRollnum("22SW024");
        s1.setYear(22);
        s1.setUniName("MUET");
        s1.setSemester(2);


        System.out.println("Name: " + s1.getName());
        System.out.println("University name: " + s1.getUniName());
        System.out.println("Roll number: " + s1.getRollnum());
        System.out.println("Semester: " + s1.getSemester());
        System.out.println("Year: " + s1.getYear());
    }
}