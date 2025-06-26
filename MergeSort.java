import java.util.ArrayList;
import java.util.Comparator;
/*
 * Merge and sort method I went with was to break the list in two halves and then sort the halves and then sort them together
 * I like this method as if the list scales up we will be able to scale with it, and keep a lower run time.
 */
public class MergeSort {
    public static void mergeSort(ArrayList<Student> list, Comparator<Student> comp) {
        if (list.size() <= 1) return;
        // breaking it out in first and last half of the list
        int mid = list.size() / 2;
        ArrayList<Student> first = new ArrayList<>(list.subList(0, mid));
        ArrayList<Student> last = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(first, comp);
        mergeSort(last, comp);

        merge(list, first, last, comp);
    }
/*
 * Merging the lists all while makeing sure the lower of the two numbers gets put in the list first
 */
    private static void merge(ArrayList<Student> result, ArrayList<Student> first, ArrayList<Student> last, Comparator<Student> comp) {
        int f = 0, l = 0, k = 0;

        while (f < first.size() && l < last.size()) {
            if (comp.compare(first.get(f), last.get(l)) <= 0) {
                result.set(k++, first.get(f++));
            } else {
                result.set(k++, last.get(l++));
            }
        }

        while (f < first.size()) {
            result.set(k++, first.get(f++));
        }

        while (l < last.size()) {
            result.set(k++, last.get(l++));
        }
    }
}
