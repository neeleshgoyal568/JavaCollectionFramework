package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
	public static void main(String[] args) {
	
		//first way
		List<String> newList=Collections.synchronizedList(new ArrayList<String>());
		
		newList.add("abc");
		newList.add("pqr");
		newList.add("oip");
		
		//for add and remove we don't need to explicit synchronized
		//for traversing we need to explicit synchronized
		
		synchronized(newList) {
			
			Iterator<String> itr = newList.iterator();
				
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
			
		}
		
		//second way
		
		//copyonArrayList class is already synchronized 
		
		CopyOnWriteArrayList<String> list2=new CopyOnWriteArrayList<String>();
		list2.add("ajmer");
		list2.add("jaipur");
		list2.add("kalkata");
		
		Iterator<String> it=list2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
