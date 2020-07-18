import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Tree_Set {


    public TreeSet<Character> creat() {
        TreeSet<Character> tree = new TreeSet<Character>();
        int ascii_one;
        Random random = new Random();
        while (tree.size() < 10) {
            ascii_one = random.nextInt(26);
            ascii_one += 97;
            tree.add((char) ascii_one);
        }
        return tree;
    }

    public ArrayList<Character> union(TreeSet<Character> treeSet_one, TreeSet<Character> treeSet_two) {
        ArrayList<Character> result = new ArrayList<>();
        result.addAll(treeSet_one);
        result.addAll(treeSet_two);
        return result;
    }

    public TreeSet<Character> Subscription(TreeSet<Character> treeSet_one, TreeSet<Character> treeSet_two) {
        TreeSet<Character> result = new TreeSet<>();
        result.addAll(treeSet_one);
        result.addAll(treeSet_two);
        return result;
    }

    public <E> void show(E obj) {
        if (obj instanceof TreeSet) {
            TreeSet<Character> tree = (TreeSet<Character>) obj;
            for (Character t : tree) {
                System.out.print(t + ", ");
            }
            System.out.println();
        } else if (obj instanceof ArrayList) {
            ArrayList<Character> arrayList = (ArrayList<Character>) obj;
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i) + ", ");
            }
        }
    }
}
