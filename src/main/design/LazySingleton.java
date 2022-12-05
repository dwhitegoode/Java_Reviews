public class LazySingleton {
	
	//ONLY DECLARE
	//instantiate when asked
	private static LazySingleton instance;
	
	private LazySingleton() {
		System.out.println("constructing lazy singleton");
	}
	
	public static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
		
	}
	
	public static void test() {
		
		System.out.println("loading lazy singleton");
	}
	

}
