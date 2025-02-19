class ExplicitTypeCasting{
	
	
	public static void main(String ...s){
		
		System.out.println("ExplicitTypeCasting=========");
		
		
		
		short a=127;
		
		byte a1= (byte) a;
		System.out.println("a = "+a+" a1 = "+a1);
		
		
			
		short a2 = 130;
		byte a3= (byte) a2;
		System.out.println("a2 = "+a2+" a3 = "+a3);
		
		
			
		int a4= 32767;
		short a5= (short) a4;
		System.out.println("a4 = "+a4+" a5 = "+a5);
			
		long a6= 32768;
		short a7= (short) a6;
		System.out.println("a6 = "+a6+" a7 = "+a7);
		
		
			
		long a8 = 2147483647;
		int a9= (int) a8;
		System.out.println("a8 = "+a8+" a9 = "+a9);
		
		
		
	    long a10 = 2147483648L;
		int a11= (int) a10;
		System.out.println("a10 = "+a10+" a11 = "+a11);
		
		
	}
}