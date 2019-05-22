package hackerrank;

import java.util.Scanner;

public class Formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            	//String 15 length, x= leading zero if length is not zero
                System.out.printf("%-15s%03d\n", s1, x);
        }
       
        System.out.println("================================");
	}

}
