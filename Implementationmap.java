package practice;

import java.util.*;
public class Implementationmap {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Hello");    
	      hm.put(2,"World");    
	      hm.put(3,"Ram");   
	       
	      System.out.println("\nThe elements of Hashmap : ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Axis");  
	      ht.put(5,"Ramar");  
	      ht.put(6,"Jashon");  
	      ht.put(7,"wick");  

	      System.out.println("\nThe elements of HashTable : ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"sam");    
	      map.put(9,"Car");    
	      map.put(10,"Cat");       
	      
	      System.out.println("\nThe elements of TreeMap :");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}