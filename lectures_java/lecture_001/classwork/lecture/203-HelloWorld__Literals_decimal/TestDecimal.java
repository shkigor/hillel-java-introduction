// Java program to illustrate the application of 
// floating-point literals 
public class TestDecimal { 
	public static void main(String[] args) 
	{ 
		float a = 101.230f; // decimal-form literal 
		float b = 0123.222f; // It also acts as decimal literal 

		// Next line causes error: malformed floating point literal
		// float c = 0x123.222; // Hexa-decimal form 

		System.out.println(a); 
		System.out.println(b); 
		// System.out.println(c); 
		System.out.println(Double.MIN_VALUE); 
		System.out.println(-Double.MAX_VALUE); 

	} 
} 
