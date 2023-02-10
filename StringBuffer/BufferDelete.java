package StringBuffer;

public class BufferDelete {

	public static void main(String args[]){  
		
		StringBuffer sb=new StringBuffer("Hello");  
		sb.delete(1,3);  
		
		System.out.println(sb);							//delete function cuts given char from string
	}  
}