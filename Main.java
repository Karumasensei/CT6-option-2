import java.util.ArrayList;
/*
 *  creating the array and implementing the sorting form the other class
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        // I used addresses of busniess around Spokane.
        students.add(new Student(10, "Adam", "7709 N Division St, Spokane, WA 99208"));     // Best Buy North
        students.add(new Student(3, "Josie", "2404 E 29th Ave, Spokane, WA 99223"));        // Best Buy South Hill
        students.add(new Student(7, "Steve", "4915 S Regal St, Spokane, WA 99223"));         // Target South
        students.add(new Student(1, "Haylee", "13724 E Sprague Ave, Spokane Valley, WA 99216")); // Target Valley
        students.add(new Student(5, "Alrik", "9770 N Newport Hwy, Spokane, WA 99218"));       // Target North
        students.add(new Student(2, "Bill", "2301 W Wellesley Ave, Spokane, WA 99205"));   // Walmart Shadle
        students.add(new Student(9, "Luke", "15727 E Broadway Ave, Spokane Valley, WA 99037")); // Walmart Valley
        students.add(new Student(6, "Frank", "9212 N Colton St, Spokane, WA 99218"));         // Walmart North
        students.add(new Student(4, "Billy", "5601 E Sprague Ave, Spokane Valley, WA 99212")); // Costco
        students.add(new Student(8, "Bob", "9329 E Montgomery Ave, Spokane Valley, WA 99206")); // Yoke's


        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        MergeSort.mergeSort(students, new RollnoComparator());

        System.out.println("\nAfter Sorting by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
