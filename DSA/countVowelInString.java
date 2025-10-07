package DSA;

public class countVowelInString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
    }
    
}
