package testFiles;

public class Sample01 {
	
	public void myMethod() {
		int n = 5;
		int i = 1;
		int sum = 0;
		int product = 1;
		sum = sum + i;
		i = i + 1;
		product = product * i;
		System.out.println(sum);
		System.err.println(product);
	}

}

/* 
 * Backward Slice <14,product> {7,9,11,14}
 * Backward Slice <13,sum> {7,8,10,13}
 * Forward Slice <7,i> {7,10,11,12,13,14}
*/

