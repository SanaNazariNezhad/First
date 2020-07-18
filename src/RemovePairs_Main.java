import java.util.ArrayList;

public class RemovePairs_Main {
    public static void main(String[] args) {
        RemovePairsInappropriate removePairsInappropriate = new RemovePairsInappropriate();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(10);
        try {
            ArrayList<Integer> result = removePairsInappropriate.removePairs(arrayList);
            print(result);

        } catch (Exception e) {
            System.out.println("ArrayList is Empty!!");
        }
    }

    public static void print(ArrayList<Integer> result) {
        System.out.print("{");
        for (int i = 0; i < result.size() - 1; i++) {
            System.out.print(result.get(i) + ", ");
        }
        System.out.print(result.get(result.size() - 1) + "}");
    }

}
