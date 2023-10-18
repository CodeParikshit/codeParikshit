

public class SubclassComeBeforSuperclass {

	public static void main(String[] args) {
// sub class must come before its super class
// We cannot have duplicate catch
// supermost class must come at the last catch
		
		//Unreachable catch block for ArithmeticException.
		//It is already handled by the catch block for Exception
		try {

		}
		  catch (ArithmeticException e) {

		} catch (ArrayIndexOutOfBoundsException e) {

		} 
		catch (Exception e) {

		}
		catch (Throwable e) {

		}
		

	}

}
