package projectRin.class28;

public class Test {
	Laptop notebook = new Laptop();
	
	public static void changePhoneId() {
		Phone.ID = 100;
	}
	
	//Cannot make a static reference to the non-static field laptop
//	public static void changeLaptop() {
//		laptop.ID = 200;
//	}
	
	public void changeLaptopId() {
		notebook.ID = 200;
	}
}
