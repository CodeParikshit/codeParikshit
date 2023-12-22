public class variable_Accessing_child extends variable_accessing {
	int car_id=223143;
	String car_name = "BMW_gt";
	
	public static void main(String args[]) {
		variable_Accessing_child car1 = new variable_Accessing_child();
		System.out.println(car1.car_id);
		System.out.println(car1.car_name);
		System.out.println(car1.show_id);
		System.out.println(car1.show_name);
		car1.display();
		
	}
	void display() {
		System.out.println(car_id);
		System.out.println(car_name);
		System.out.println(show_id);
		System.out.println(show_name);
	}
}