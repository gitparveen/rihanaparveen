package org.gits;

public class Employee {
public void empId(String name)
{
	System.out.println("string method"+name);
	
}
public void empId(String email,long phno,char block)
{
	System.out.println("email is"+email);
	System.out.println("phno is"+phno);
	System.out.println("block is"+block);
	}
public static void main(String[] args) {
	Employee obj=new Employee();
	obj.empId("parveen");
	obj.empId("parveenam95@gmail.com", 8667344864l, 'A');
}
}
