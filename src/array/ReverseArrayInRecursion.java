package array;

import java.util.Scanner;

public class ReverseArrayInRecursion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		
		int[] arr=new int[l];
		for(int i=0; i<l; i++) {
			arr[i]=sc.nextInt();
		}
		int start=0; 
		int end=l-1;
		
		reverse(arr, start, end);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

	private static void reverse(int[] arr, int start, int end) {

		if(start>=end) {
			return;
		}
		
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		reverse(arr, start+1, end-1);
	}
}
