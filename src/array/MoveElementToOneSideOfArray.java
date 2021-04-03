package array;

import java.util.Scanner;

//Move -ve element to one side of the array
public class MoveElementToOneSideOfArray {

	public static void main(String[] args) {

		// with Quicksort partition method
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		moveNveEelement(arr, 0, size);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void moveNveEelement(int[] arr, int start, int end) {

		int j = 0;
		for (int i = 0; i < end; i++) {
			if (arr[i] < 0 && i != j) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			j++;
		}
	}
}
