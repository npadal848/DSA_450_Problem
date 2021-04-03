package array;

import java.util.HashSet;
import java.util.Scanner;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = null;
		int[] arr2 = null;
		int t = sc.nextInt();
		int n = 0;
		int m = 0;
		
		HashSet<Integer> set=null;
		
		while (t-- > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			arr1 = new int[n];
			arr2 = new int[m];
			
			for (int i = 0; i < n; i++) {
				arr1[i] = sc.nextInt();
			}
			
			for (int i = 0; i < m; i++) {
				arr2[i] = sc.nextInt();
			}
			set=new HashSet<>();
			int size=n>m?n:m;
			for(int i=0; i<size; i++) {
				
				if(i<n) {
					set.add(arr1[i]);
				}
				if(i<m){
					set.add(arr2[i]);
				}
			}
			System.out.println(set.size());
		}
		
	}
}
