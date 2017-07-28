package TaskEmployee;

public class AllWork {
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	public AllWork(Task[] tasks) {
		this.tasks = tasks;
		this.freePlacesForTasks = 10;
		this.currentUnassignedTask = -1;
	}

	public void addTasks(Task task) {
		this.tasks[this.tasks.length - this.freePlacesForTasks--] = task;
	}

	public Task getNextTask(Task[] tasks) {
		this.currentUnassignedTask++;
		Task result = this.tasks[this.currentUnassignedTask];
		this.tasks[this.currentUnassignedTask] = null;
		return result;
	}

	public boolean isAllWorkDone() {
		boolean done = false;
		for (int i = 0; i < this.tasks.length; i++) {
			if (this.tasks[i] == null) {
				done = true;
			}
			if (!done) {
				break;
			}
		}
		return false;
	}

	public Task[] getTasks() {
		return this.tasks;
	}

	public int getCurrentUnassignedTask() {
		return this.currentUnassignedTask;
	}

}
