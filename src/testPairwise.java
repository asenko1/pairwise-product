import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Random;
public class testPairwise {

	@Test
	public void pairwiseTest() {
		mainFile test = new mainFile();
		assertEquals(6, test.pairwise_1("123"));
		assertEquals(test.pairwise_1("123"), pairwiseCompare("123"));
		
		//Stress test
		
		
				
	}
	
	//another solution to use in stress testing
	public int pairwiseCompare(String nums){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < nums.length(); i++){
			numbers.add((int) nums.charAt(i) - '0');
		}
		int result = 0;
		int n = numbers.size();
		for (int i = 0; i < n; ++i) {
		  for (int j = i + 1; j < n; ++j) {
		    if (numbers.get(i) * numbers.get(j) > result) {
		      result = numbers.get(i) * numbers.get(j);
		    }
		  }
		}
		return result;
	}

}
