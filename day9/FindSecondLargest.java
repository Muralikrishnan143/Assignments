package Week4.day1;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//a) Create a empty Set Using TreeSet
		Set<Integer> val=new TreeSet<Integer>();
		//b) Declare for loop iterator from 0 to data.length and add into Set 
		for(int i=0;i<data.length;i++){
			val.add(data[i]);
			}
		 //c) converted Set into List
		 List<Integer> name=new ArrayList<Integer>(val);
		  //d) Print the second last element from List
		 System.out.println("Second Largest is "+name.get(name.size()-2));
		
	}
	}
