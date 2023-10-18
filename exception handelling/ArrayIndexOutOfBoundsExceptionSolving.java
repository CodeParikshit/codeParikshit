public class ArrayIndexOutOfBoundsExceptionSolving {

	public static void main(String[] args) {

		int a[] = new int[] { 11, 22, 33, 44, 55 };

		try{
 			a[4] = 100; // access the last element in the array
		}
catch(ArrayIndexOutOfBoundsException){
		System.out.println("After the init");
}

	}

}