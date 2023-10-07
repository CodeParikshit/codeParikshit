
public class  Employe {
	int EmpId;
	String EmpName;
	String EmpMobile;
	String EmpAdress;
	String EmpSalary;
	String EmpDeparment;
	String EmpDesignation;

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		this.EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		this.EmpName = empName;
	}

	public String getEmpMobile() {
		return EmpMobile;
	}

	public void setEmpMobile(String empMobile) {
		this.EmpMobile = empMobile;
	}

	public String getEmpAdress() {
		return EmpAdress;
	}

	public void setEmpAdress(String empAdress) {
		this.EmpAdress = empAdress;
	}

	public String getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.EmpSalary = empSalary;
	}

	public String getEmpDeparment() {
		return EmpDeparment;
	}

	public void setEmpDeparment(String empDeparment) {
		this.EmpDeparment = empDeparment;
	}

	public String getEmpDesignation() {
		return EmpDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.EmpDesignation = empDesignation;
	}
public static void main(String args[]){

		Employe e1=new Employe();
		
		e1.setEmpId(123456);
		e1.setEmpName("Parikshit");
		e1.setEmpMobile("8530345056");
		e1.setEmpAdress("Kharadi");
		e1.setEmpSalary("50000000");
		e1.setEmpDeparment("Deployment");
		e1.setEmpDesignation("xyz");
		
		System.out.println(e1.EmpId);
		System.out.println(e1.EmpName);
		System.out.println(e1.EmpMobile);
		System.out.println(e1.EmpAdress);
		System.out.println(e1.EmpSalary);
		System.out.println(e1.EmpDeparment);
		System.out.println(e1.EmpDesignation);
		
		
		
		
		

	}
}


	
