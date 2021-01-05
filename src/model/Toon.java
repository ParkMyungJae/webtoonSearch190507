package model;

public class Toon {
	private String name;
	private String id;
	
	public Toon(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public boolean checkContain(String value) {
		if(name.contains(value)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Toon [name=" + name + ", id=" + id + "]";
	}
}
