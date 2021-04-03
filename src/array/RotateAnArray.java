package array;

import java.util.Scanner;

public class RotateAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a = null;
		while (t-- > 0) {
			int n = sc.nextInt();
			a=new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			rotateArray(a, n);
			
			for(int i: a) {
				System.out.print(i+" ");
			}
		}
	}

	static void rotateArray(int[] arr, int n) {

		int lastE = arr[n - 1];

		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = lastE;
	}
}
