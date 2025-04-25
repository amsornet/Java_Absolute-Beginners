import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>();

        t.add(1);
        t.add(2);
        t.add(1);
        t.add(2);
        t.add(1);
        t.add(2);
        t.get(0);
        t.set(1, 5);
        t.subList(1, 3);

        System.out.println(t.subList(1, 4));

        LinkedList<Integer> y = new LinkedList<Integer>();
        y.add(1);
        y.add(2);
        y.add(1);
        y.add(2);
        y.add(1);
        y.add(2);
        y.get(0);
        y.set(1, 5);
        y.subList(1, 3);

        System.out.println(y.subList(1, 4));

    }
}
