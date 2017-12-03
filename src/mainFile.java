import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainFile {
	public static void main(String[] args){
		
		System.out.println(pairwise_1(args[1]));
		
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
	
	public static void stressTest(){
		
		
		
	}

}
