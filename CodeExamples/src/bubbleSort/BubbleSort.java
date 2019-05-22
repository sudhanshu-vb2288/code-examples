package bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {34, 6, 5, 44, 23, 32 , 11, 31, 45, 66}; 
		bubbleSort(array);
	}
	
	public static void bubbleSort(int[] arr) {
		int temp;
		boolean swapped;
		for(int i=0;i<arr.length-1;i++) {
			
			swapped = false;
			for(int j=0;j<arr.length - i -1;j++) {
				
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if (swapped==false) { 
				break; 
			}
		}
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
