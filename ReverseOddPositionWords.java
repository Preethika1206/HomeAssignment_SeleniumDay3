package week1.day3.HomeAssignemt;

public class ReverseOddPositionWords {
    public static void main(String[] args) {

        String test = "I am a software tester";

        String[] words = test.split(" ");

      
        for (int i = 0; i < words.length; i++) {
    
            if (i % 2 != 0) {
   
                String word = words[i];
                char[] wordArray = word.toCharArray(); 
                int left = 0, right = wordArray.length - 1;

      
                while (left < right) {
                    char temp = wordArray[left];
                    wordArray[left] = wordArray[right];
                    wordArray[right] = temp;
                    left++;
                    right--;
                }

                words[i] = new String(wordArray);
            }
        }
        String result = String.join(" ", words);

        System.out.println(result);
    }
}
