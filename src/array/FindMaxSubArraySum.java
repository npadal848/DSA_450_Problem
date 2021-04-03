package array;

import java.util.Scanner;

public class FindMaxSubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(maxSubarraySum(a, n));
	}

	static int maxSubarraySum(int arr[], int n) {
		int sum = 0;
		int maxSum = arr[0];
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum > maxSum)
				maxSum = sum;
			if (sum < 0)
				sum = 0;
		}
		return maxSum;
	}
}
