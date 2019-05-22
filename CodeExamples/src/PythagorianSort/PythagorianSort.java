package PythagorianSort;

import java.util.Arrays;

public class PythagorianSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,20,30,1,2,3,4,5,6,44,58,55,5};
		pythagorianSort(array);
	}
	
	public static void pythagorianSort(int[] arr) {
		// Square array elements 
        for (int i=0; i<arr.length-1; i++) 
            arr[i] = arr[i]*arr[i]; 
   
        // Sort array elements 
        Arrays.sort(arr); 
        
        for(int i=arr.length-1; i>=2 ; i--) {
        	int l = 0;
        	int r = i - 1;
        	while(l<r) {
        		if(arr[l] + arr[r] == arr[i]) {
        			System.out.println("Found Pair (a,b,c)"+"("+arr[l]+","+arr[r]+","+arr[i]+")");
        		}
        		if(arr[i] + arr[r] < arr[i])
        			l++;
        		else
        			r--;
        	}
        }
	}

}
