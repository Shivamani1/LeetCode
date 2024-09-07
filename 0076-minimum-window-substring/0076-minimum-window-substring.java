import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if (len2 > len1) return "";

        // Maps to store character frequencies
        HashMap<Character, Integer> hs = new HashMap<>();
        HashMap<Character, Integer> ht = new HashMap<>();

        // Fill the target frequency map
        for (int i = 0; i < len2; i++) {
            char ch = t.charAt(i);
            ht.put(ch, ht.getOrDefault(ch, 0) + 1);
        }

        int min = Integer.MAX_VALUE; // To store the minimum length of the window
        int i = 0, j = 0; // Two pointers for the sliding window
        int c = 0; // To keep track of how many characters have been fully matched
        int st = -1, end = -1; // Start and end indices of the minimum window

        while (j < len1) {
            char ch = s.charAt(j);

            // Expand the window by adding character from 's'
            if (ht.containsKey(ch)) {
                hs.put(ch, hs.getOrDefault(ch, 0) + 1);

                // If current character count in 'hs' matches the required count in 'ht'
                if (hs.get(ch).intValue() == ht.get(ch).intValue()) {
                    c++;
                }
            }

            // Shrink the window when all characters in 't' are matched
            while (i <= j && c == ht.size()) {
                if (j - i + 1 < min) {
                    min = j - i + 1;
                    st = i;
                    end = j;
                }

                // Try to remove character from the window (i.e., from the left)
                char temp = s.charAt(i);
                if (ht.containsKey(temp)) {
                    hs.put(temp, hs.get(temp) - 1);

                    // If the character count goes below the required count, reduce 'c'
                    if (hs.get(temp) < ht.get(temp)) {
                        c--;
                    }
                }
                i++;
            }

            j++; // Move the right pointer of the window
        }

        // If no valid window is found, return an empty string
        if (st == -1) {
            return "";
        }

        return s.substring(st, end + 1);
    }
}
