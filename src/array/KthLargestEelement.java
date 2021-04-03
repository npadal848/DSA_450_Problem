package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KthLargestEelement {

	public static void main(String[] args) {
		
		FastReader reader=new FastReader();
		int t=reader.nextInt();
		int[] arr=null;
		
		while(t-->0) {
			int n=reader.nextInt();
			int k=reader.nextInt();
			arr=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=reader.nextInt();
			}
			findKthLargestElement(arr, k, n);
		}
	}	
	private static void findKthLargestElement(int[] arr, int k, int n) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		
		for(int i: arr) {
			minHeap.add(i);
			
			if(minHeap.size()>k) {
				minHeap.poll();
			}
		}
		System.out.println(minHeap.peek());
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
