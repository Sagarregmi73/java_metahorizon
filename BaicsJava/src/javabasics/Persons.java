package javabasics;

import java.util.ArrayList;
import java.util.Iterator;

public class Persons {
	
	

	public static void main(String[] args) {
		
	
		ArrayList <String> a1=new ArrayList<String>();
		a1.add("sagar");
		a1.add("sanjok");
		
		a1.add("roshan");
		a1.remove("roshan");
		ArrayList <Integer> a2=new ArrayList<Integer>();
		a2.add(11);
		
		
		Iterator itr=a1.iterator();
		
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
			
		}
//		for(String s:a1) {
//			System.out.println(s);
//		}

	}

}
