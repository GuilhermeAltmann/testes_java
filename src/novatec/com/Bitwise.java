package novatec.com;

public class Bitwise {
	
	public static void main(String[] args) {
		
		byte a = 0x1F;
		byte b = 0x10;
		
		System.out.println("Valores a = " + a + ", b = " + b);
		System.out.println("Valores a & b = " + (a & b));
		System.out.println("Valores a ^ b = " + (a ^ b));
		System.out.println("Valores ˜ b = " + (~ b));
		System.out.println(" a << 2 = " + (a << 2));
		System.out.println("-a >> 4 = " + (-a >> 4));
		System.out.println("-a >>> 4 =" + (-a >>> 4));
	}

}
