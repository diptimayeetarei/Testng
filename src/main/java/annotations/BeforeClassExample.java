package annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassExample {
	
	@BeforeClass
	public void myBeforeClassMethod() {
		System.out.println(" I am inside my Before class ");
	}
	@BeforeMethod
	public void myBeforeMethod() {
		System.out.println(" I am inside my Before method");
	}
	@Test
	public void TestMethod() {
		System.out.println(" I am inside Test method");
	}

	@Test
	public void TestMethodTwo() {
		System.out.println(" I am inside Test method Two");
	}
}
