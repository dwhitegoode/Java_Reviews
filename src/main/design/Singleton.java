public class Singleton {
	
	public String name;
	
	
	
	static {
		System.out.println("this is a static inititializer block that exectutes as soon as the class is loaded");
	}
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("constructing Singleton object");
	}
	
	//two references to an instance vs two instances
	public static Singleton getInstance() {
		return instance;
	}

	static void test() {
		System.out.println("loading our Eager Singleton class");
	}
}
