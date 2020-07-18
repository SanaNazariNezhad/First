import java.util.Arrays;
import java.util.HashMap;

public class PremutationsString {

    public void premutationWord(String string) {
        if (string.length() == 0)
            System.out.print("String is empty!");
        else {
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            string = new String(charArray);
            HashMap<Character, Integer> hashMap = new HashMap();
            for (int i = 0; i < string.length(); i++) {
                if (!hashMap.containsKey(string.charAt(i))) {
                    hashMap.put(string.charAt(i), 1);
                    String temp = string.substring(0, i) + string.substring(i + 1);
                    permutation(temp, String.valueOf(string.charAt(i)), string.length());
                }
            }
        }
    }

    public void permutation(String str, String ans, int length) {
        if (ans.length() == length) {
            System.out.println(ans);
            return;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), 1);
                String temp = str.substring(0, i) + str.substring(i + 1);
                permutation(temp, ans + str.charAt(i), length);
            }
        }
    }
}
