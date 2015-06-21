package eu.rtakacs.jsp.domain;

public class Pet extends Animal{
	
	private String name;
	private PetType type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PetType getType() {
		return type;
	}
	public void setType(PetType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Pet [name=" + name + ", type=" + type + "]";
	}
	
}
