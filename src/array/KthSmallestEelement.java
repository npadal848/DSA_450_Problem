package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KthSmallestEelement {

	public static void main(String[] args) {
		
//		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
//		maxHeap.add(4);
//		maxHeap.add(10);
//		maxHeap.add(9);
//		maxHeap.add(1);
//		
//		System.out.println(maxHeap);
//		System.out.println(maxHeap.poll());
//		System.out.println(maxHeap.remove());
//		System.out.println(maxHeap.remove());
//		System.out.println(maxHeap);
		
		FastReader reader=new FastReader();
		int t=reader.nextInt();
		int[] arr=null; 
		while(t-->0) {
			int size=reader.nextInt();
			int k=reader.nextInt();
			arr=new int[size];
			
			for(int i=0; i<size; i++) {
				arr[i]=reader.nextInt();
			}
			findKthSmallestElement(arr, k);
		}
	}
	
	static void findKthSmallestElement(int[] arr, int k) {
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i: arr) {
			maxHeap.add(i);
			
			if(maxHeap.size()>k) {
				maxHeap.poll();
			}
		}
		System.out.println(maxHeap.peek());
	}
	
	static class FastReader {

		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			if (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
