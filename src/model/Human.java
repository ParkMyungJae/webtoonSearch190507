package model;

public class Human {
	private String name;
	private int age;

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Human() {
		this.name = "Gondr";
		this.age = 100;
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름은 " + this.name + "이고 나이는 " + this.age;
	}
}
