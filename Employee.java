package Task1_Person;

public class Employee extends Person{
	
	private double daySalary;
		
	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary;
	}
	
	public double calculateOvertime(double hours){		
		if(this.age <= 18){
			return 0;
		}else {			
				double hourSalary = this.daySalary/8;
				return hours*(hourSalary*1.5);			
		}		
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("Day salary: " + this.daySalary);
	}

}
