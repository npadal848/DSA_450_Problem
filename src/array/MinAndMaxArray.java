package array;

import java.util.Scanner;

public class MinAndMaxArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		
		int[] arr=new int[l];
		for(int i=0; i<l; i++) {
			arr[i]=sc.nextInt();
		}
		int min=0;
		int max=0;
		
		if(l==1) {
			min=arr[0];
			max=arr[0];
			System.out.println("Max: "+max+", Min: "+min);
			return;
		}
		
		if(l==2) {
			if(arr[0]>arr[1]) {
				min=arr[1];
				max=arr[0];
			}else if(arr[0]<arr[1]) {
				min=arr[0];
				max=arr[1];
			}else {
				min=arr[0];
				max=arr[1];
			}
			System.out.println("Max: "+max+", Min: "+min);
			return;
		}
		
		min=arr[0];
		max=arr[0];
		
		for(int i=1; i<l; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max: "+max+", Min: "+min);
	}
}
