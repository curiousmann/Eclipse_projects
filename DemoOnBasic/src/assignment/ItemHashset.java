package assignment;

import java.util.Iterator;
import java.util.HashSet;

public class ItemHashset {

	public static void main(String[] args) {
		HashSet<Item> Itm = new HashSet<Item>();
		
		
		Itm.add(new Item(1001,"smith",30.0f));
		Itm.add(new Item(1004,"martin",10.0f));
		Itm.add(new Item(1011,"lal",26.5f));
		Itm.add(new Item(1016,"jagan",06.0f));

		System.out.println("displaying the elements using iterator :\n");
		 Iterator<Item> Itr= Itm.iterator();
		 
		 while(Itr.hasNext()) {
			  Item etr =Itr.next();
			  System.out.println(etr.getItemId()+" "+etr.getItemName()+" "+etr.getItemPrice());
		 }
		 System.out.println("\nusing foreach loop jdk 1.5 :\n");
		 for(Item e: Itm) {
			 System.out.println(e.getItemId()+" "+e.getItemName()+" "+e.getItemPrice());
		 }
		 
		 System.out.println("\nusing forEach lambda function jdk 1.8 :\n");
		 Itm.forEach((e)->System.out.println(e.getItemId()+" "+e.getItemName()+" "+e.getItemPrice()));

	}

}
