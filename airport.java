
public class airport extends flight{
	String company = "vistara";
	public void display() {
		System.out.println(company);
		System.out.println(super.company);
		super.display();
	}

}
