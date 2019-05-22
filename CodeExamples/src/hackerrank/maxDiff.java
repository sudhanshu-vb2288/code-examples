package hackerrank;

import java.util.Arrays;
import java.util.List;

public class maxDiff {
	public static void main(String args[]) {
		//int[] arr = {5, 10, 8,7,6,5};
		int[] arr = {9,7,4,13,6,3,2};
		//List<Integer> arr1 = Arrays.asList();
		int diff = maxNumber(arr);
		System.out.println(diff);
	}
	
	public static int maxNumber(int[] a) {
		
		int min = a[0];
		int maxDiff = a[1] - a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i] - min > maxDiff) {
				maxDiff = a[i] - min;
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		
		return maxDiff;
	}
	/*public static int maxNumber(List<Integer> a) {
		
		int min = a.get(0);
		int maxDiff = a.get(1) - a.get(0);
		for(int i=0;i<a.size();i++) {
			if(a.get(i) - min > maxDiff) {
				maxDiff = a.get(i) - min;
			}
			if(a.get(i) < min) {
				min = a.get(i);
			}
		}
		
		return maxDiff;
	}
*/
}
