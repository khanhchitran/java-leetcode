class LongestString {
    public int lengthOfLongestSubstring(String s) {
        // Early return: if string length is 1 or less
        int length = s.length();
        if (length <= 1) {
            return length;
        }

        int max = 1;  // Variable to store the maximum length

        // Outer loop to iterate over all starting points of the substring
        for (int i = 0; i < length; i++) {
            StringBuilder currentSubstring = new StringBuilder();  // Use StringBuilder for the current substring
            currentSubstring.append(s.charAt(i));  // Start with the ith character

            // Inner loop to extend the substring
            for (int j = i + 1; j < length; j++) {
                char currentChar = s.charAt(j);

                // Check if the current substring already contains the current character
                if (currentSubstring.indexOf(String.valueOf(currentChar)) == -1) {
                    currentSubstring.append(currentChar);  // Append the character if it's not already in the substring
                } else {
                    break;  // Stop if a duplicate character is found
                }
            }

            // Update max length after each iteration
            max = Math.max(max, currentSubstring.length());
        }

        return max;  // Return the maximum length found
    }
}
