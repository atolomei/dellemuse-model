package dellemuse.model;

public enum Sex {
	FEMALE 	(0, "fenmale"),
	MALE 	(1, "male");

	int code;
	String name;
	
	private Sex(int code, String name) {
		this.name=name;
		this.code=code;
	}
	
	
	public int getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
}
