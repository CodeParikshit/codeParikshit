public class HandelMethodException{
	private static void m1() throws Exception {
		System.out.println("Inside m1");
		m2();
	}

	private static void m2() throws Exception {
		System.out.println("Inside m2");
		m3();
	}

	private static void m3() throws Exception {
		System.out.println("Inside m3");
		m4();
	}

	private static void m4() throws Exception {
		System.out.println("Inside m4");
		m5();
	}

	private static void m5() throws Exception {
		System.out.println("Inside m5");
		
		Exception e = new Exception();
		throw e; // explicitly throw an exception
	}

	public static void main(String[] args) throws Exception {
		System.out.println("This is first line");
		m1();
		System.out.println("This is last line");
	}
}
