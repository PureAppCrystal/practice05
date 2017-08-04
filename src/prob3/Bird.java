package prob3;

public abstract class Bird {
	private String name;

	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	@Override
	public abstract String toString();
	
	public abstract void fly();
	public abstract void sing();
}
