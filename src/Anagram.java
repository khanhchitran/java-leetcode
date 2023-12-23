import java.util.HashMap;

class Anagram {
    public boolean isAnagram(String s, String t) {
        // Early return if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Increment for characters in 's' and decrement for characters in 't'
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);  // Fix: Use t.charAt(i) for the second string
            
            // Increment frequency for 's'
            map.put(charS, map.getOrDefault(charS, 0) + 1);
            // Decrement frequency for 't'
            map.put(charT, map.getOrDefault(charT, 0) - 1);
        }

        // Check if all values in the map are zero
        for (int val : map.values()) {
            if (val != 0) {
                return false;  // If any value is not zero, they are not anagrams
            }
        }

        return true;  // All values are zero, so 's' and 't' are anagrams
    }
}
