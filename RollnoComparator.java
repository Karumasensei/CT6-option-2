import java.util.Comparator;

public class RollnoComparator implements Comparator<Student> {
   /*
    * Comparator for comparing the rollno and finding the lower number
    */
    public int compare(Student a, Student b) {
        if (a.rollno < b.rollno) {
            return -1;
        } else if (a.rollno > b.rollno) {
            return 1;
        } else {
            return 0;
        }
    }
}
