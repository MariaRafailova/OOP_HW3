package Task1_Person;

import java.util.Arrays;

public class Demo_1 {
public static void main(String[] args) {
	
	Person[] people = new Person[10];
	
	Person pesho = new Person("Pesho", 48, false);
	fillingArr(people, pesho);
	Person lili = new Person("Lili", 21, true);
	fillingArr(people,lili);
	
	Student eli = new Student("Eli", 25, true, 5);
	fillingArr(people, eli);
	Student gosho = new Student("Gosho", 20, false, 4);
	fillingArr(people, gosho);
	
	Employee katia = new Employee("Katia", 35, true, 100);
	fillingArr(people, katia);
	Employee spas = new Employee("Spas", 52, false, 80);
	fillingArr(people, spas);	
	
	
	for (int i = 0; i < people.length; i++) {
		if (people[i] != null) {
			people[i].showInfo();
		}
	}	
	
	for (int i = 0; i < people.length; i++) {
		if (people[i] != null && people[i] instanceof Employee) {				
			System.out.println(people[i].name + " has additional payment " +
					((Employee)people[i]).calculateOvertime(2));
		}
	}	
	
}

static Person[] fillingArr(Person[] people, Person person){
	for (int i = 0; i < people.length; i++) {
		if(people[i] == null){
			people[i] = person;
			break;
		}
	}	
	return people;
}

}
