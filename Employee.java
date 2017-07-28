package TaskEmployee;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private AllWork allwork;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setCurrentTask(Task task) {
//		if (task != null) {
			this.currentTask = task;
//		} else {
//			System.out.println("Invalid task");
//		}
	}

	public Task getCurrentTask() {		
		return this.currentTask;
	}

	public void setHoursLeft(int hours) {
//		if(hours > 0){
			this.hoursLeft = hours;
//		} else {
//			System.out.println("Invalid hours");
//		}
	}

	public int getHoursLeft() {
		return this.hoursLeft;
	}

	public void work() {
			if(this.currentTask == null || this.currentTask.getworkHours() == 0){
				if (this.allwork.getCurrentUnassignedTask() != this.allwork.getTasks().length-1) {
					this.currentTask = this.allwork.getNextTask(this.allwork.getTasks());
					System.out.println(this.name+" starts new task "+this.currentTask.getName());
				}				
			}
			else if (this.currentTask.getworkHours() > this.hoursLeft) {
				this.currentTask.setworkHours(this.currentTask.getworkHours() - this.hoursLeft);
				this.setHoursLeft(0);
			}
			else if (this.currentTask.getworkHours() == this.hoursLeft) {
				this.currentTask.setworkHours(0);
				System.out.println(this.name+" finished the task");
				this.setHoursLeft(0);			
			}
			else if (this.currentTask.getworkHours() < this.hoursLeft) {
				this.setHoursLeft(this.hoursLeft - this.currentTask.getworkHours());
				this.currentTask.setworkHours(0);		
				System.out.println(this.name+" finished the task "+this.currentTask.getName());
			}	
	}
	
	public void startWorkingDay(){
		this.hoursLeft = 8;	
	}
	
	public void setAllWork(AllWork work){
		this.allwork = work;
	}
	
	public AllWork getAllWork(){
		return this.allwork;
	}
	

	// Za Demo1:
//	public void showReport() {
//		System.out.println("Name: " + this.name + '\n' + 
//				"Task: " + this.currentTask.getName() + '\n' + 
//				"Employee hours left: "
//				+ this.hoursLeft + '\n' + 
//				"Task hours left: " + this.currentTask.getworkHours());
//	}
		
}
