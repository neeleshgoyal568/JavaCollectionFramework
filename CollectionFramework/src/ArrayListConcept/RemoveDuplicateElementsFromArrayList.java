package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromArrayList {
	public static void main(String[] args) {
		
	/**
	 * 1. using LinkedHashSet
	 * 2. Stream api
	 */
		
		ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,6,7,8,9,6,4,2));
		
		LinkedHashSet<Integer> numbers=new LinkedHashSet<Integer>(number);
		
		ArrayList<Integer> numbersUnique=new ArrayList<Integer>(numbers);
		
		System.out.println(numbersUnique);
		
		
		//stream
		ArrayList<Integer> streamsNumber=new ArrayList<Integer>(Arrays.asList(1,2,3,2,4,5,6,3,4,8,9,0));
		
		List<Integer> streamList=streamsNumber.stream().distinct().collect(Collectors.toList());
		System.out.println(streamList);
		
		
	}
}
