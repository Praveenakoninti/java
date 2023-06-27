*******************************************************************************/
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int firstUniqChar(String s) {
        // Create a hashmap to store character frequencies
        Map<Character, Integer> charFreq = new HashMap<>();

        // Calculate the frequency of each character
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character and return its index
        for (int i = 0; i < s.length(); i++) {
            if (charFreq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println(firstUniqChar(s1));  // Output: 0

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2));  // Output: 2

        String s3 = "aabb";
        System.out.println(firstUniqChar(s3));  // Output: -1
    }
}
