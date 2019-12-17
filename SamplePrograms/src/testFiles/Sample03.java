package testFiles;

public class Sample03 {
	public void myMethod() {
		int a = 1;
		int b = 1;
		int c = 5;
		int d;
		int f = 12;
		a = 20;
		c = a + c;
		b = b * c;
		c = b + (a / 4);
		d = c - 3;
		f = d % 2;
		b = b + d;
	}

}


/*
 * A Proposed Java Static Slicing Approach
 * Backward Slice <12,b> {5,6,7,10,11,12}
 * Forward Slice <12,b> {12,13,14,15,16}
*/
