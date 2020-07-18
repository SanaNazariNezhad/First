import java.util.HashMap;
import java.util.Scanner;

public class PermutationString_Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        PremutationsString premutationsString = new PremutationsString();
        String[] stringArray;
        System.out.print("Enter String: ");
        String string = scanner.nextLine();
        if (string.contains(" ")) {
            stringArray = string.split(" ");
            if (equalHashmap(stringArray)) {
                System.out.println("PASS" + "\n");
                premutationsString.premutationWord(stringArray[0]);
            } else
                System.out.println("Fail");
        } else
            premutationsString.premutationWord(string);
    }

    public static boolean equalHashmap(String[] stringArray) {
        String first = stringArray[0];
        String second = stringArray[1];
        HashMap<Character, Integer> hashMap_first = new HashMap();
        HashMap<Character, Integer> hashMap_second = new HashMap();
        for (int i = 0; i < first.length(); i++) {
            if (!hashMap_first.containsKey(first.charAt(i))) {
                hashMap_first.put(first.charAt(i), 1);
            }
        }
        for (int i = 0; i < second.length(); i++) {
            if (!hashMap_second.containsKey(second.charAt(i))) {
                hashMap_second.put(second.charAt(i), 1);
            }
        }
        if (hashMap_first.keySet().equals(hashMap_second.keySet()))
            return true;
        else
            return false;
    }

}
