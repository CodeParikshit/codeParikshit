public class HandelMethodExceptionByTrycatch {
	private static void m1() {
		System.out.println("Inside m1");
		m2();
	}

	private static void m2() {
		System.out.println("Inside m2");
		m3();
	}

	private static void m3() {
		System.out.println("Inside m3");
		m4();
	}

	private static void m4() {
		System.out.println("Inside m4");
		m5();
	}

	private static void m5() {
		System.out.println("Inside m5");
		int x = 10 / 0;
	}

	public static void main(String[] args) {
		System.out.println("This is first line");
		try {
			m1();
		} catch (Exception e) {

			e.printStackTrace();
			
			System.out.println("\n\nmessage = "+e.getMessage());
		}

		System.out.println("\n\nThis is last line");
	}

}
