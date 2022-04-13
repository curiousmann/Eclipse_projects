package com.ust.constructor;

public class TestOnConstructor {
	int empno;
	String ename;
	float sal;
	public TestOnConstructor() {
		
	}
	
	public TestOnConstructor(int empno, String ename, float sal) {
		this.empno=empno;
		this.ename=ename;
		this.sal=sal;
	}

	public static void main(String[] args) {
	TestOnConstructor toc1=new TestOnConstructor(1, "test", 9);
	TestOnConstructor toc2=new TestOnConstructor();
	System.out.println(toc1.empno);
	System.out.println(toc1.ename);
	System.out.println(toc1.sal);
	System.out.println(toc2.empno);
	System.out.println(toc2.ename);
	System.out.println(toc2.sal);
	
	}

}
