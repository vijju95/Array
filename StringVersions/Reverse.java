package StringVersions;

public class Reverse {
	public static void main(String[] args) {

		String s = "Vijay";

		char [] ch=s.toCharArray();
		
		for(int i=s.length()-1;i>0;i--) {
			String neww=ch.toString();
			System.out.println(neww);
		}
	}
}
