package org.gits;

public class Students {
	public void stdId(String name)
	{
		System.out.println("string method"+name);
		
	}
	public void stdId(String email,long phno,char block)
	{
		System.out.println("email is"+email);
		System.out.println("phno is"+phno);
		System.out.println("block is"+block);
		}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.stdId("parveen");
		obj.stdId("parveenam95@gmail.com", 8667344864l, 'A');
	}

}
