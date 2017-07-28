package TaskEmployee;

public class Task {
	private String name;
	private int workingHours;

	public Task(String name, int workingHours) {
		this.name = name;
		this.workingHours = workingHours;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setworkHours(int hours) {
		this.workingHours = hours;
	}

	public int getworkHours() {
		return this.workingHours;
	}

}
