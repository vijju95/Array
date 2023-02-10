package StringVersions;

import java.util.Arrays;

public class GetByte {
	
	public static void main(String[] args) {

	    String vijay = "Java";
	    byte[] byteArray;						// convert the string to a byte array

	    byteArray = vijay.getBytes();				// using platform's default charset
	    
	    System.out.println(Arrays.toString(byteArray));
	  }
}
// output is in integer form convert character to int....

