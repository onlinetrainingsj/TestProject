package testABCD;

import org.testng.annotations.Test;

public class TestClass {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello ABCD");
		System.out.println("Hello Child Branch");
	}
	
	@Test
	public void a() {
		System.out.println("Helo TestNG");
	}

}
