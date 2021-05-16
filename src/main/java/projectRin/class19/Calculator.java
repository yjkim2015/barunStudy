package projectRin.class19;

public class Calculator implements Promise {
	//The type Calculator must implement the inherited abstract method Promise.info()
	//public String name = "test";
	
	@Override
	public void info() {
		System.out.println("Calculator Info");
	}
	
	@Override
	public void getName() {
		System.out.println(name);
	}
	
}
