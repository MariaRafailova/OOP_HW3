package Task2_MusicFestival;

public class Group {
	public final String name;
	private Musician[] musicians;
	private boolean vocalist;
	private Song[] songs;

	Group(String name, Musician[] musicians, boolean vocalist, Song[] songs) {
		this.name = name;
		this.musicians = musicians;		
		this.vocalist = vocalist;
		this.songs = songs;
	}

	public boolean isVocalist() {
		return this.vocalist;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void printSongInfo(){
		for (int i = 0; i < songs.length; i++) {
			System.out.print(this.songs[i].getTitle()+": " + this.songs[i].getText()+", ");
			for (int j = 0; j < musicians.length; j++) {
				System.out.print(this.musicians[j].getInstrument()+" ");				
			}
			System.out.println();
		}		
	}
	
	public void printSongInfo2(){
		for (int i = 0; i < songs.length; i++) {
			System.out.print(this.songs[i].getTitle()+":  ");			
			System.out.println(" Instrumental");			
		}		
	}
}
