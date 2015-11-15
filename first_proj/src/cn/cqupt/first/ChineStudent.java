package cn.cqupt.first;

import java.util.Map;

import java.util.HashMap;

public class ChineStudent implements Students {

	private String name;
	private String address;
	private int age;

	public ChineStudent() {
		super();
	}

	public ChineStudent(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public ChineStudent(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	@Override
	public void eated() {
		// TODO Auto-generated method stub
		System.out.println("在食堂吃");
	}

	@Override
	public void walk() {
		System.out.println("走路");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("认真学习");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChineStudent other = (ChineStudent) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String args[]){
		ChineStudent cs1 = new ChineStudent();
		cs1.name = "zhangsan";
		cs1.age = 12;
		cs1.address = "xuesheng";
		
		ChineStudent cs2 = new ChineStudent();
		cs2.name = "zhangsan";
		cs2.age = 12;
		cs2.address = "jiaoshi";
		
		ChineStudent cs3 = new ChineStudent();
		cs3.name = "zhangsan";
		cs3.age = 12;
		cs3.address = "xuesheng1";
		
		System.out.println(cs1.equals(cs2));
		System.out.println(cs1.equals(cs3));
	
		HashMap<ChineStudent, String> map = new HashMap<ChineStudent, String>();
		map.put(cs1 , "cs1对应的值");
		map.put(cs2 , "cs2对应的值");
		map.put(cs3 , "cs3对应的值");
		
		String s = map.get(new ChineStudent("zhangsan","xuesheng",12));
		System.out.println(s);
		
	}

}