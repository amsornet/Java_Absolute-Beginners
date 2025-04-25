import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;



public class SetsAndList {
    public static void main(String[] args) {

        Set<Integer> t = new HashSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-8);
        t.remove(9);
        t.size();

        int x = t.size();

//        System.out.println(x);
        //

        Set<Integer> y = new TreeSet<Integer> ();
        y.add(5);
        y.add(7);
        y.add(5);
        y.add(9);
        y.add(15);
        y.add(-8);
        y.remove(9);
        y.size();

        int z = y.size();

//        System.out.println(y);

        Set<Integer> p = new LinkedHashSet<Integer> ();
        p.add(5);
        p.add(7);
        p.add(5);
        p.add(9);
        p.add(15);
        p.add(-8);
        p.remove(9);
        p.size();

        int r = p.size();
        System.out.println(p);



    }
}
