package Task2_MusicFestival;

public class Musician {
	private String name;
	private String instrument;
	
	Musician(String name, String instrument){
		this.name = name;	
		this.instrument = instrument;
	}	
	
	public String getInstrument() {
		return this.instrument;
	}
}
