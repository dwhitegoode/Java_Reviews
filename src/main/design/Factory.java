public class Factory {
	
	public static Dessert getDessert(String type) {
	switch(type) {
	case "cake": return new Cake();
	case "brownie": return new Brownie();
	case "cookie": return new Cookie();
	default: throw new DessertNotFoundException();
	
	}
}
}

class DessertNotFoundException extends RuntimeException{
	public DessertNotFoundException() {
		super("Did not enter a valid dessert option1");
	}
}

interface Dessert{
	String bake();
}

class Cake implements Dessert {

	public String bake() {
		// TODO Auto-generated method stub
		return "bake carrot cake!";
	}
	
}

class Cookie implements Dessert{

	public String bake() {
		// TODO Auto-generated method stub
		return "everyone loves flan!";
	}
}

class Brownie implements Dessert{

	public String bake() {
		// TODO Auto-generated method stub
		return null;
	}	
}
