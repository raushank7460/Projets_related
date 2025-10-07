package DSA;

public class reverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        int n = charArray.length;

        
        for (int i = 0; i < n / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[n - i - 1];
            charArray[n - i - 1] = temp;
        }

        
        String reversedStr = new String(charArray);
        System.out.println("Reversed string: " + reversedStr);
    }
}
