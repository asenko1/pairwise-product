import java.util.ArrayList;
import java.util.List;

public class mainFile {
	public static void main(String[] args){
		List<Integer> intList = new ArrayList<Integer>();
		//args[1] is the int list
		for(int i = 0; i < args[1].length(); i++){
			intList.add((int) args[1].charAt(i) - '0');
		}
		intList.sort(null);
		System.out.println(intList.get(intList.size() - 1) * intList.get(intList.size() - 2));
		
	}

}
