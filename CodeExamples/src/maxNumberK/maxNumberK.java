package maxNumberK;
import java.util.Arrays;
import java.util.Collections;
public class maxNumberK {

	public static void main(String[] args) {
		int[] arr = {1,5,33,66,2,33,43,2};
		int k = 3;
		//int[] output = new int[k];
		findLargeNumSol1(arr,k);
		
	}
	public static void findLargeNumSol1(int[] arr, int k) {
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1, j=0;j<k;i--,j++) {
			System.out.println(arr[i]);
		}
	}
}
