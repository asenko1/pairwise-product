import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class mainFile {
	public static void main(String[] args){
		
		System.out.println(pairwise_1(args[1]));
		
		stressTest(100, 0, 50);
		
		
	}
	
	public static int pairwise_1(String array){
		List<Integer> intList = new ArrayList<Integer>();
		//args[1] is the int list
		for(int i = 0; i < array.length(); i++){
			intList.add((int) array.charAt(i) - '0');
		}
		intList.sort(null);
		return intList.get(intList.size() - 1) * intList.get(intList.size() - 2);
	}
	
	public static void stressTest(int num_tests, int min_val, int max_val){
		//As is pretty much just checking for exceptions as is
		String stringBuilder = "";
		Random rand = new Random();
		int[] testNums = new int[10];
		for(int i = 0; i < num_tests; i++){
			for(int j = 0; j < 10; j++){
				testNums[j] = rand.nextInt(max_val) + min_val;
			}
			stringBuilder = "";
			for(int j : testNums){
				stringBuilder = stringBuilder + j; //could probably use StringBuffer
			}
			pairwise_1(stringBuilder);
		}
		
		
		
	}

}
