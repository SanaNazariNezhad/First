import java.util.ArrayList;

public class RemovePairsInappropriate {
    public ArrayList<Integer> removePairs(ArrayList<Integer> arrayList) throws Exception {
        if (arrayList.isEmpty())
            throw new Exception("Empty!");
        else if (arrayList.size() % 2 != 0)
            arrayList.remove(arrayList.size() - 1);

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i += 2) {
            if (arrayList.get(i) <= arrayList.get(i + 1)) {
                result.add(arrayList.get(i));
                result.add(arrayList.get(i + 1));
            }
        }

        return result;
    }
}
