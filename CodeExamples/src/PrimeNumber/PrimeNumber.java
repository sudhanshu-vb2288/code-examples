package PrimeNumber;

import java.util.ArrayList;
import java.util.List;

class PrimeNumber{
	public static void main(String[] args){
		findPrime(17);
	}
	
	public static void findPrimeMethod2 (int n) {
		int i, m=0, flag=0;
		
		
	}
	
	public static void findPrime(int n){
		//int[] primeArray = new int[n-1];
		List<Integer> primeArray1 = new ArrayList<Integer>();
		for(int i=2;i<n;i++) {
			primeArray1.add(i);
		}
		//System.out.println(primeArray1);
		
		for(int j=4;j<n;j++){
			//System.out.println("j="+j);
			
			for(int i=0; primeArray1.get(i)<j && i<primeArray1.size();i++) {
				//System.out.println("i="+i+", primeArray1["+i+"]="+primeArray1.get(i));
				
				if((j % primeArray1.get(i)) == 0) {
					//System.out.println(j+"%prime"+primeArray1.get(i)+"="+j % primeArray1.get(i));
					
					if(i!=0 || i!=1 || j!=primeArray1.get(i)) {
						//System.out.println("i="+i);
						if(primeArray1.contains(j)) {
							primeArray1.remove(primeArray1.indexOf(j));
						}
						//System.out.println("removed"+j);
						//System.out.println(primeArray1);
					}
					if(j==n-1) {
						break;
					}
				}
			}
		}
		//int a[] = new int[primeArray1.size()];
		for(int i=0;i<primeArray1.size();i++) {
			System.out.print(primeArray1.get(i)+" ");
		}
		System.out.println(primeArray1);
		
	}
}
