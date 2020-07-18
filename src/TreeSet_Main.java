import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSet_Main {
    public static void main(String[] args) {
        TreeSet<Character> treeSet_one;
        TreeSet<Character> treeSet_two;
        ArrayList<Character> union;
        TreeSet<Character> Subscription;

        Tree_Set tree = new Tree_Set();

        treeSet_one = tree.creat();
        System.out.println("Tree one:");
        tree.show(treeSet_one);

        treeSet_two = tree.creat();
        System.out.println("Tree two:");
        tree.show(treeSet_two);

        union = tree.union(treeSet_one, treeSet_two);
        System.out.println("Union:");
        tree.show(union);

        Subscription = tree.Subscription(treeSet_one, treeSet_two);
        System.out.println("\nSubscription:");
        tree.show(Subscription);


    }

}
