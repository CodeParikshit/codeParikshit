class city {
	private int pincode;
	private String name;
	private String State;
	
	
	city(String name,int pincode,String State){
		this.name=name;
		this.pincode=pincode;
		this.State=State;
	}
	
	
	
	
	
	//public void setName(String name) {
		//this.name = name;
	//}
	public String getName() {
		return name;
	}
	//public void setState(String state) {
		//State = state;
	//}
	public String getState() {
		return State;
	}
	
//	public void setpincode(int pincode) {
	//	this.pincode=pincode;
	//}
	public int getpincode() {
		return pincode;
	}

}