
public class Some {
	private static String name;
	private String newName;
	
	Some(String name){
		this.newName = name;
	}
	static {
		name = "debayan";
	}
	public static void showName() {
		System.out.println(name);
	}
	public void display() {
		System.out.println(this.newName);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Some.showName();
		Some some = new Some("Rohit");
		some.display();
	}
}
