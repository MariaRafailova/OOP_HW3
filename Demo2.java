package TaskEmployee;

public class Demo2 {
	public static void main(String[] args) {
		Task[] tasks1 = new Task[10];

		AllWork allWork1 = new AllWork(tasks1);

		Task task1 = new Task("Task1", 20);
		allWork1.addTasks(task1);
		Task task2 = new Task("Task2", 3);
		allWork1.addTasks(task2);
		Task task3 = new Task("Task3", 10);
		allWork1.addTasks(task3);
		Task task4 = new Task("Task4", 15);
		allWork1.addTasks(task4);
		Task task5 = new Task("Task5", 8);
		allWork1.addTasks(task5);
		Task task6 = new Task("Task6", 35);
		allWork1.addTasks(task6);
		Task task7 = new Task("Task7", 2);
		allWork1.addTasks(task7);
		Task task8 = new Task("Task8", 15);
		allWork1.addTasks(task8);
		Task task9 = new Task("Task9", 3);
		allWork1.addTasks(task9);
		Task task10 = new Task("Task10", 1);
		allWork1.addTasks(task10);

		Employee pesho = new Employee("Pesho");
		pesho.setAllWork(allWork1);
		Employee ivan = new Employee("Ivan");
		ivan.setAllWork(allWork1);
		Employee didi = new Employee("Didi");
		didi.setAllWork(allWork1);

		int count = 1;
		while (!allWork1.isAllWorkDone()) {
			System.out.println("---Start new working day--- "+count);
			pesho.startWorkingDay();
			ivan.startWorkingDay();
			didi.startWorkingDay();
			while (pesho.getHoursLeft()!=0 && ivan.getHoursLeft()!=0 && didi.getHoursLeft()!=0) {
				if (pesho.getHoursLeft() != 0) {
					pesho.work();
				}
				if (ivan.getHoursLeft() != 0) {
					ivan.work();
				}
				if (didi.getHoursLeft() != 0) {
					didi.work();
				}				
			}
			count++;
		}

	}
}
