package DSA;

public class largestNum {
    public static void  main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
       

        int largest = largest(arr, n);
        System.out.println( largest);
    }
    public static int largest(int arr[], int n) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    
}

