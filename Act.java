package Task2_MusicFestival;

public class Act {
	private String stage;
	private Group group;
	private int start;
	private int end;
	
	Act(String stage, Group group, int start, int end){
		this.stage = stage;
		this.group = group;
		this.start = start;
		this.end = end;
	}
	
	public void printActInfo(){		
			System.out.printf("%s will play from %dh to %dh on %s%n", this.group.getName(), this.start, this.end, this.stage);		
			if (this.group.isVocalist()) {
				this.group.printSongInfo();
			}
			else {
				this.group.printSongInfo2();
			}
	}
}
