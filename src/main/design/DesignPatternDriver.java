import java.util.Scanner;

public class DesignPatternDriver {
	
	public static void main(String[] args) {
		
		//testSingleton();
		eagerVSLazy();
	}
	
	static void factory() {
		System.out.println("Hey! What kind of desser do you want?");
		
		Scanner scanner = new Scanner(System.in);
		String dessert = scanner.nextLine();
		
		Dessert des = Factory.getDessert(dessert);
		System.out.println(des.bake());
	}
	
	static void  eagerVSLazy() {
		Singleton.test();
	}
	
	static void testSingleton() {
		Singleton single = Singleton.getInstance();
		single.name = "first singleton!";
		
		Singleton single2 = Singleton.getInstance();
		single2.name = "Second singleton!";
		
		System.out.println("First singleton name = " + single.name);
		System.out.println("Second singleton name = " + single2.name);
	}

}
