package test;

public enum Type {
	CREATE(1, "CREATED"),
	UPDATE(2, "UPDATED"),
	RETRIEVE(3, "RETRIEVED"),
	DELETE(4, "DELETED"),
	NOTIFY(5, "NOTIFYD");
	
	final int value;
	final String name;
	private Type(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int Value() {
		return this.value;
	}
	
	public String Name() {
		return this.name;
	}
	
	
}
