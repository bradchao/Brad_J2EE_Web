package tw.brad.j2ee.beans;

import java.io.Serializable;

public class Member implements Serializable {
	private String id;
	private String name;
	public Member(){
	}
	public void setId(String id){this.id = id; m1();}
	public String getId(){return id;}
	public void setName(String name){this.name = name;}
	public String getName(){return name;}
	private void m1(){
		System.out.println("m1()");
	}
}
