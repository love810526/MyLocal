import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OddOccurrencesInArray {
	   public static int solution(int[] A) {
	        List<Integer> pairs = new ArrayList<>();

	        for(int number: A) {
	            if (pairs.contains(number)) {
	                pairs.remove(pairs.indexOf(number));
	            } else {
	                pairs.add(number);
	            }
	        }

	        return pairs.get(0);
	    }
	   
	   public static Set<Integer> solution2(int[] A) {
		   Set<Integer> result = new HashSet<>();
		   for(int number: A) {
			   if (result.contains(number)) {
				   result.remove(number);
			   }else {
				   result.add(number);
			   }
			   
		   }
		   return result;
	   }
	    public static void main (String[] args) {
	        int[] inputArr = {9, 3, 9, 3, 9, 7, 9};
	        Set<Integer> result = solution2(inputArr);
	        System.out.println("result: "+ result);
	    }
}
