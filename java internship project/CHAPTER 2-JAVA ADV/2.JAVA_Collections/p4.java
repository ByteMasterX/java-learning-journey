
import java.util.TreeSet;

public class p4{
    public static void main(String[] args) {
        TreeSet <Integer> bineryTree = new TreeSet<>();
        bineryTree.add(3);
        bineryTree.add(4);
        bineryTree.add(4);
        bineryTree.add(1);
        bineryTree.add(4);
        bineryTree.add(2);
        bineryTree.add(4);
        bineryTree.add(5);
        bineryTree.add(4);
        bineryTree.add(7);
        bineryTree.add(4);
        System.out.println(bineryTree);
        System.out.println(bineryTree.subSet(1, 4));

    }
}