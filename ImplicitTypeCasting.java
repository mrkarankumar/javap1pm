class ImplicitTypeCasting{
	public static void main(String ...s){
		System.out.println("Need for types casting");
		int x = 40;
		int y = 30;
		float z = x/y;
		
		
		System.out.println("z ="+z);
		
		System.out.println("implicitTypesCasting===========");
		
		byte a= 127;
		short a1= a;
		System.out.println("a = "+a+" a1 = "+a1);
		
		short a2= 32767;
		int a3 = a2;
		System.out.println("a2 = "+a2" a3 = "+a3);
		
		
		
		int a4= 2147483647;
		long a5 = a2;
		System.out.println("a4 = "+a4" a5 = "+a5);
		
		
		
		
	
	}
	
}