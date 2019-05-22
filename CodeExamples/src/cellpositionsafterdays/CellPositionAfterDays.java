package cellpositionsafterdays;

import java.util.ArrayList;
import java.util.List;

public class CellPositionAfterDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of 'Cell Position After Days' Program");
		/*
		int[] sum = {1, 0, 0, 0, 0, 1, 0, 0};
		int days = 1;
		*/
		
		int[] sum = {1, 1, 1, 0, 1, 1, 1, 1};
		int days = 2;
		
		
		List<Integer> outputList;
		outputList = output(sum,days);		
		
		System.out.println(outputList);
		
		// Carret is bit-wise XOR 
		int c=Carret(1,2);
		int d=Carret(0,1);
		int e=Carret(1,1);
		int f=Carret(0,0);
		int g=Carret(3,3);
		int h=Carret(3,2);
		int i=Carret(9,2);
		
		System.out.println("C (1^2)"+c);
		System.out.println("D (0^1)"+d);
		System.out.println("E (1^1)"+e);
		System.out.println("F (0^0)"+f);
		System.out.println("G (3^3)"+g);
		System.out.println("H (3^2)"+h);
		System.out.println("I (9^2)"+i);
		
		
		System.out.println("End of 'Cell Position After Days' Program");

	}

	public static List<Integer> output(int[] cells, int days){
		
		List<Integer> output = new ArrayList<Integer>();
		int n = cells.length;
		int[] temp = new int[cells.length];
		
		
		while(days-- >0) {
			
			temp[0] = 0 ^ cells[1];
			temp[n-1] = 0 ^ cells[n-2];
			
			for(int i=1;i<n-1;i++) {
				temp[i] = cells[i-1] ^ cells[i+1];
			}
			
			for(int i=0;i<n;i++) {
				cells[i] = temp[i];
			}
		}
		
		for(int i=0;i<n;i++) {
			output.add(i, temp[i]);
		}
		return output;
	}
	
	public static int Carret(int a, int b) {
		int c = a^b;
		return c;
	}
	
}
