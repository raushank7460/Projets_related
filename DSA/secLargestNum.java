package DSA;

public class secLargestNum {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }

        if (secLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("The second largest element is: " + secLargest);
        }
    }
    
}
