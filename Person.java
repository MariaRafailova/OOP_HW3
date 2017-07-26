package Task1_Person;

public class Person {

	protected String name;
	protected int age;
	protected boolean isMale;	
	
	//za da se sazdade constructor Student() v SubClass-a Student:
	public Person(){
		
	}
	
	public Person(String name, int age, boolean isMale){
		this.name = name;
		this.age = age;
		this.isMale = isMale;		
	}
	
	public void showInfo(){
		System.out.println("Name: "+ this.name+'\n'+ 
							"Age: "+ this.age);
		System.out.println(isMale? "female" : "male");
	}
}
