package integrate;

import java.util.HashSet;
import java.util.List;

import slicer.Criterion;
import slicer.Slicer;

public class ForwardSliceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Slicer slicer = new Slicer();
		String filePath = "C:\\Users\\Toukir Ahammed\\eclipse-workspace\\SamplePrograms\\src\\testFiles\\Sample03.java";
		HashSet<String> variableset = new HashSet<>();
		variableset.add("b");
		Criterion criterion = new Criterion(12, variableset);
		try {
			List<Integer> slicedLines = slicer.getForwardSlice(filePath, criterion);
			
			System.out.println("Sliced Lines are:");
			
			for (Integer integer : slicedLines) {
				System.out.println("Satement: " + integer);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
