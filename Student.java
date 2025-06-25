public class Student {
    int rollno;
    String name;
    String address;
/*
 * Creating the student and what info it will hold
 */
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return rollno + " || " + name + " || " + address;
    }
}
