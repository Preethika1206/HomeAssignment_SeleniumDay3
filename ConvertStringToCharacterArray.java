package week1.day3.HomeAssignemt;

public class ConvertStringToCharacterArray {
    public static void main(String[] args) {
        // The input string
        String text = "changeme";
        
        // Step 1: Convert the string to a character array
        char[] chars = text.toCharArray();
        
        // Step 2: Loop through each character in reverse order
        for (int i = chars.length - 1; i >= 0; i--) {
            // Step 3: Check if the index is odd
            if (i % 2 != 0) {
                // Step 4: Convert to uppercase if the index is odd
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        
        System.out.println(new String(chars));
    }
}
