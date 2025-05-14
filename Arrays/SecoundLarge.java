import java.util.Scanner;

public class SecoundLarge {

    public static int secound(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secoundlargest = Integer.MIN_VALUE;

        // Find the largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find the second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest && arr[i] > secoundlargest) {
                secoundlargest = arr[i];
            }
        }

        // Check if second largest was found
        if (secoundlargest == Integer.MIN_VALUE) {
            System.out.println("Second largest not found!");
            return -1;
        }

        return secoundlargest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Please enter at least two elements.");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = secound(arr);
        if (result != -1) {
            System.out.println("The second largest element is: " + result);
        }
    }
}
