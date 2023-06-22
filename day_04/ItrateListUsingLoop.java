package day_04;

import java.util.*;


public class ItrateListUsingLoop {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> aList = new ArrayList<>();
		aList.add("Computer");
		aList.add("Mobile");
		aList.add("Laptop");
		aList.add("Tab");
		
		for(int i = 0; i<aList.size();i++)
		{
			System.out.println("Iterating using for loop: "+aList.get(i));
		}
		System.out.println("-----------------------");
		int i = 0;
		while(i<aList.size()) {
			System.out.println("Iterating using while loop: "+aList.get(i));
			i++;
		}
		System.out.println("-----------------------");
		int j = 0;
		do {
			System.out.println("Iterating using do loop: "+aList.get(j));
			j++;
		}while(j<aList.size());
			
	}

}
