package assignment;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {
TreeSet<Employee>  ts = new TreeSet<Employee>();
		
		ts.add(new Employee(1001,"smith",3000));
		ts.add(new Employee(1004,"martin",4000));
		ts.add(new Employee(1011,"lal",2000));
		ts.add(new Employee(1016,"jagan",5000));
		
		System.out.println(ts);//ascending order
		
		System.out.println("displaying the elements using iterator");
		Iterator<Employee> iobj =ts.iterator();
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
		
		System.out.println("displaying the elements using desecnding order descdendingiterator");
		Iterator<Employee> i2=ts.descendingIterator();
		while(i2.hasNext()) {
			System.out.print(i2.next()+" ");
		}

	}

}
