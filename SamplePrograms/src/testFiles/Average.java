package testFiles;

public class Average {
	
	public static void getAverage() {
		int n = 3;
		int product = 1;
		int sum = 1;		
		int a = 10;
		int b = 20;
		int c = 60;
		
		product = product * a;
		product = product * b ;
		product = product * c;
		
		sum = sum + a;
		sum = sum + b;
		sum = sum + c;
		
		double average = (sum) / n ;
		System.out.println("The total is " + sum) ;
		System.out.println("The product is " + product) ;
		System.out.println("The average is " + average) ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAverage();
	}

}
