package com.ust.list;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleOnLinkedList1 {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add("Hello");
		ll.add(10.0f);
		ll.add(true);
		ll.add(null);
		ll.add('a');
		ll.add("Hello");

		System.out.println("size of an linked list : " + ll.size());
		System.out.println(ll);

		// adding elements at First and Last Positions.

		ll.addFirst("smith");
		ll.addLast(100);

		System.out.println("after adding the elements at First and Last : " + ll.size());
		System.out.println(ll);

		// replacing the null value at Position 5th
		ll.set(5, "hi");
		System.out.println("after replace the null at position 5th");
		System.out.println(ll);

		// remove an element at Position 6
		ll.remove(6);
		System.out.println("after remove an element at Positio 6th");
		System.out.println(ll);

		// get the Object based on the position at 6
		Object o = ll.get(6);
		String s = (String) o;

		System.out.println("Object value at the 6th Position :" + s);

		// contain() to search
		System.out.println(ll.contains("Hello"));
		System.out.println(ll.contains("welcome"));

		System.out.println("First Object :" + ll.getFirst());
		System.out.println("Last Object : " + ll.getLast());

		System.out.println("displaying the object using Iterator");
		Iterator iobj = ll.iterator();

		while (iobj.hasNext()) {
			System.out.print(iobj.next() + " ");
		}
		System.out.println(" ");
		System.out.println("displaying the object in backward direction using Iterator");
		Iterator i2 = ll.descendingIterator();
		while (i2.hasNext()) {
			System.out.print(i2.next() + " ");
		}

		// displaying the element using the java8 forEach Lambda Function

	}

}
