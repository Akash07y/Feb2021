package Pack1;

public class Class2 {

	
	
	public static int[] data(int a, int b) {
		
		int [] f = {23,45};
		return f;
	}
	
	System.out.printlm("Hi");
	
	public static void main(String[] args) {
		
		String a = "Velocity";
		int i = a.length();
		
		char [] b = new char[i];
		
		// String to array
		for(int j = 0 ; j < a.length() ; j ++)
		{
			b[j] = a.charAt(i-1);
			i--;
		}
		
		// Array to string 
		String d = "";
		System.out.println();
		for(int j = 0 ; j < b.length ; j ++)
		{
			d = d + b[j];
			
		}
		 a = d;
		 System.out.println(a);
		
		

	}

}
