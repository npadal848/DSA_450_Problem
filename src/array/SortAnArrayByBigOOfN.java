package array;

import java.util.Scanner;

public class SortAnArrayByBigOOfN {

	public static void main(String[] args) {
	
		// Nlogn approach
//		for(int i=0; i<n; i++){
//	        for(int j=0; j<n; j++){
//	            if(a[i]<a[j]){
//	                int temp=a[i];
//	                a[i]=a[j];
//	                a[j]=temp;
//	            }
//	        }   
//	    }
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int low=0;
	    int mid=0;
	    int high=n-1;
	    int temp=0;
	    int[] a=new int[n];
	    for(int i=0; i<n; i++) {
	    	a[i]=sc.nextInt();
	    }
	    
	    while(mid<=high) {
	    	switch(a[mid]) {
	    		case 0:
	    			temp=a[low];
	    			a[low]=a[mid];
	    			a[mid]=temp;
	    			low++;
	    			mid++;
	    			break;
	    		case 1:
	    			mid++;
	    			break;
	    		case 2:
	    			temp=a[high];
	    			a[high]=a[mid];
	    			a[mid]=temp;
	    			high--;
	    			break;
	    	}
	    }
	    
	    for(int i: a) {
	    	System.out.print(i+" ");
	    }
	}
}
