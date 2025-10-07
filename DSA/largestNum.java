package DSA;

public class largestNum {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The largest element is: " + largest);
    }
    
}

