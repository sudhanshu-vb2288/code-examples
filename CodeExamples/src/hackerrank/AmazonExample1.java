package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AmazonExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] test = {"ykc 82 01","eo first qpx","09z cat hamster","06f 12 25 6","az0 first qpx","236 cat dog rabbit snake"};
		List<String> boxList = Arrays.asList(test);
		//List<String> out = new ArrayList<String>();
		//out = orderedJunctionBoxes(6, boxList);
		
		List<String> out = orderedJunctionBoxes(6, boxList);
	}
	public static List<String> orderedJunctionBoxes (int numberOfBoxes, List<String> boxList) {
		
		List<String> newOutString = new ArrayList<String>();
		List<String> oldOutString = new ArrayList<String>();
		List<String> id = new ArrayList<String>();
		List<String> ver = new ArrayList<String>(); 
		//List<String> idSorted = new ArrayList<String>();
		List<String> verSorted = new ArrayList<String>(); 
		for(String box: boxList) {
			 String last = box.substring(box.lastIndexOf(' ') + 1);
			 int index = box.indexOf(" ");
				
			 // If numeric then it is newer version of box
			 if(isNumeric(last)) newOutString.add(box);
			 else {				 
				 //Separate identifier and version
				 id.add(box);
				 ver.add(box.substring(index+1));		 
				 
			 }
			
		}
		// Sort based on version and identifier
		Collections.sort(ver);
		Collections.sort(id);
		
		System.out.println("---- version boxes sorted ---");
		/*for(String out: ver) {
			System.out.println(out);
		}*/
		
		System.out.println("--- ######## --- ");
		for(String version : ver) {
			for(String ident: id) {
				int index = ident.indexOf(" ");
				if(version.equalsIgnoreCase(ident.substring(index+1))) {
					verSorted.add(ident);
				}
				else {
					//verSorted.add(ident);
				}
			}
		}
		List<String> verSortedNew = verSorted.stream().distinct().collect(Collectors.toList());
		
		//verSorted = sortVersion(ver, boxList, id);
		//idSorted = sortIdentifier(id,boxList);
		
		System.out.println("-----");
		System.out.println("--- Old boxes version -----");
		for(String vers: verSortedNew) {
			System.out.println(vers);
		}
		System.out.println("*************");
		/*for(String id1: idSorted) {
			System.out.println(id1);
		}*/
		 
		System.out.println("-----");
		System.out.println("New boxes");
		for(String out: newOutString) {
			System.out.println(out);
			
		}
		
		return newOutString;
		
	}
	public static boolean isNumeric(String last) {
		try {
			Integer.parseInt(last);
			return true;
		}
		catch(Exception e){
			return false;
		}
		
	}
	
}


