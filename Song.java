package Task2_MusicFestival;

public class Song {
	private String title;
	private String text;
	
	Song(String title, String text){
		this.title = title;
		this.text = text;
	}
	
	public String getText(){
		return this.text;
	}
	
	public String getTitle(){
		return this.title;
	}
}
