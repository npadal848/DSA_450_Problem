package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		
		int[] arr=new int[l];
		int index=0;
		//With O(n) approach
//		for(int i=l-1; i>=0; i--) {
//			arr[i]=sc.nextInt();
//		}
		
		for(int i=0; i<l; i++) {
			arr[i]=sc.nextInt();
		}
		//With recursion
		reverse(arr, 0, arr.length-1);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

	private static void reverse(int[] arr, int s, int e) {
		if(s>=e) {
			return;
		}
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
		
		reverse(arr, s+1, e-1);
	}
}
