package Task1_Person;

public class Student extends Person{
	private double score;
	
	//moje da ima Student() /bez parametri/ tuk, 
	//ako ima constructor Person() v SuperClass-a Person
	public Student(){
	
	}	

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.score = score;
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("Score: " + this.score);
	}

}
