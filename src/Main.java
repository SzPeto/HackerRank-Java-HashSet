import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		
	      Scanner s = new Scanner(System.in);
	      int t = s.nextInt();
	      String [] pair_left = new String[t];
	      String [] pair_right = new String[t];
	      
	      for (int i = 0; i < t; i++) {
	          pair_left[i] = s.next();
	          pair_right[i] = s.next();
	      }
	      
	        HashSet<String> pairs = new HashSet<>();
	        int count = 0;
		    for(int i = 0; i<t; i++) {
	            
	            String pair1 = pair_left[i] + " " + pair_right[i];
	            String pair2 = pair_right[i] + " " + pair_left[i];
	            if(!pairs.contains(pair1)) {
		       	    pairs.add(pair1);
	                pairs.add(pair2);
		     	    count++;
		       	    System.out.println(count);
	            } else {
	                System.out.println(count);
	            }
		    	  
		    }
	      
	}
	
}
