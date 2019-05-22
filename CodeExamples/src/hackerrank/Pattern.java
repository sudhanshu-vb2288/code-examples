package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		List<Integer> inputList = new ArrayList<>();
		
		while(in.hasNextInt()) {
			//System.out.println("Inside while loop");
			inputList.add(in.nextInt());
		}
		//System.out.print("Outside While Loop");
		//System.out.println(inputList);
		
		int[] outArr = new int[inputList.size()];
		
		for(int i=0;i<inputList.size();i++) {
			if(i==0) {
				outArr[i] = inputList.get(i) + 1;
			}
			else {
				outArr[i] = (inputList.get(i) * inputList.get(i-1)) + 1;
			}
		}
		
		for(int i=0;i<inputList.size();i++) {
			System.out.print(outArr[i]+" ");
		}
		
	
	}
//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
}
