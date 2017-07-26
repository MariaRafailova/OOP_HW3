package Task2_MusicFestival;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Demo_2 {
	public static void main(String[] args) {
		
		Act[] acts = new Act[3];
		
		Musician mus1 = new Musician("Mus1", "Instr1");
		Musician mus2 = new Musician("Mus2", "Instr2");
		Musician mus3 = new Musician("Mus3", "Instr3");		
		Musician[] musicians1 = {mus1, mus2, mus3};
		
		Song song1 = new Song("Title1", "Text1");
		Song song2 = new Song("Title2", "Text2");
		Song song3 = new Song("Title3", "Text3");
		Song song4 = new Song("Title4", "Text4");
		Song[] songs1 = {song1, song2, song3, song4};
		
		Group group1 = new Group("Group1", musicians1, true, songs1);		
		Act act1 = new Act("stage1", group1, 18, 22);
		acts[0] = act1;
		
		Musician mus4 = new Musician("Mus4", "Instr1");
		Musician mus5 = new Musician("Mus5", "Instr2");
		Musician mus6 = new Musician("Mus6", "Instr3");		
		Musician[] musicians2 = {mus4, mus5, mus6};
		
		Song song5 = new Song("Title5", null);
		Song song6 = new Song("Title6", null);
		Song song7 = new Song("Title7", null);		
		Song[] songs2 = {song5, song6, song7};
		
		Group group2 = new Group("Group2", musicians2, false, songs2);		
		Act act2 = new Act("stage2", group2, 18, 20);
		acts[1] = act2;
		
		Musician mus7 = new Musician("Mus7", "Instr1");
		Musician mus8 = new Musician("Mus8", "Instr2");			
		Musician[] musicians3 = {mus7, mus8};
		
		Song song8 = new Song("Title8", "Text8");			
		Song[] songs3 = {song8};
		
		Group group3 = new Group("Group3", musicians3, true, songs3);		
		Act act3 = new Act("stage2", group3, 20, 22);
		acts[2] = act3;
		
		for(int i = 0; i<acts.length; i++){
			acts[i].printActInfo();
		}
	}

	
}
