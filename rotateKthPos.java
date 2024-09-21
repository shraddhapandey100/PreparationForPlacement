import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        int n = scanner.nextInt();
        int arr[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Input the size of the subarray (k)
        int k = scanner.nextInt();
        
        // Output array size (should be n - k + 1)
        int output[] = new int[n - k + 1];
        
        // Loop through the array and find the maximum in each subarray of size k
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            output[i] = max;
        }
        
        // Output the result
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
