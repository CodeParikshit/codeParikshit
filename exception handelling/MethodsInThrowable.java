public class  MethodsInThrowable {
	public static void main(String[] args) {
		System.out.println("This is first line");
		int x;

		try {
			x = 10 / 0;

		} catch (Exception e) {
			System.out.println("Inside catch ... ");

			e.printStackTrace();
		}

		System.out.println("This is last line");
	}
}
