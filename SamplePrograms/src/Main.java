public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod();

	}
	
	public static void myMethod() {		
		int n = 5;
		int i = 1;
		int sum = 0;
		int product = 1;
		sum = sum + i;
		i = i + 1;
		product = product * i;
		System.out.println(sum);
		System.err.println(product);
		int y = 0;
		int z = product + y;
	}
	
	public static void hello() {
		int n = 5;
		int i = 1;
		int sum = 0;
		int product = 1;
		if (i <= n){
			sum = sum + i;
			product = product * i;
			i = i + 1;
		}
//			else{
//			sum = sum + i;
//			product = product * i;
//			i = i + 1;
//		}
		System.out.println(sum);
		System.err.println(product);
		
	}
	
	public void loop() {
		int n = 5;
		int i = 1;
		int sum = 0;
		int product = 1;
		while(i <= n){
			sum = sum + i;
			product = product * i;
			i = i + 1;
		}		
		System.out.println(sum);
		System.err.println(product);
		
	}
	
	public static void getAverage() {
		int n = 3;
		int product = 1;
		int sum = 1;		
		int x = 10;
		int y = 20;
		int z = 60;
		
		sum = sum + x;
		sum = sum + y;
		sum = sum + z;
		
		product = product * x;
		product = product * y ;
		product = product * z;
		
		double average = (sum) / n ;
		System.out.println("The total is " + sum) ;
		System.out.println("The product is " + product) ;
		System.out.println("The average is " + average) ;
		
	}

}
