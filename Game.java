package chestysCasino;
import java.util.Scanner;
import chestysCasino.Person.*;
import chestysCasino.Player.*;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
public class Game {
static Scanner in = new Scanner(System.in);
	public static void main(String[] args)  throws IOException{
		Person p = new Person();
		System.out.println("Welcome to Chesty's Casino! Please enter your name to begin.");
		List<PlayerData> stats = new ArrayList<>();
		p.setName(Game.in.next());
		stats.add(p.getName());
		save(stats, new File("PlayerData.csv"));
		do {
			if (name.equalsIgnoreCase(null)) {
				System.out.println("Please enter your name to begin.");
				name = in.next();
				
			} else {
				System.out.println("Welcome " + name.substring(0, 1).toUpperCase() + name.substring(1) + "! Let's begin.");
				break;
			}
		} while (true);
	}
		
		

		
		
		
		
		//////////// END OF GAME ///////////////
//		Game.endOfGame();

	
 



	public static void endOfGame() {
		System.out.println("Would you like to play again? Please enter Y or N.");
		String playAgain = in.next();
		do {
			if (playAgain.equalsIgnoreCase("N")) {
				System.out.println("Goodbye, come play again soon!");
				break;
				
			} else if (playAgain.equalsIgnoreCase("Y")) {
				Deck.shuffle();
				/////////////////// LOOP BACK TO GAME //////////////////
				
			} else {
				System.out.println("Please enter Y or N.");
				playAgain = in.next();
			}
		} while (true);
	

	}
	public void readData() throws Exception{
		/////////////////////// READS PLAYER DATA FROM FILE AND PRINTS TO CONSOLE//////////////////////////////////////
		try (InputStream in = new FileInputStream(new File("PlayerData.txt"))){
			int b;
			while ((b = in.read()) != -1) {
				System.out.println((char)b);
			}
		}
	
	}
	public static void save(List<PlayerData> stats, File file) throws IOException { // Path from java.nio is a newer version of File
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) { // append if file aleady exists
			for (PlayerData playerData : stats) {
				writer.write(playerData.csvFormat());
				writer.newLine();
			}
			
		}
		
	}
	
	class PlayerData implements Serializable{
		Person p = new Person();
		Player b = new Player();
		//private String name;
		private double bank;
		private static final long serialVersionUID = 14738274879L; // Inaccurate, pulled from git **UPDATE**
		public PlayerData() {
			super();
		}
		public PlayerData(String name, int bank) {
			super();
			p.setName(name);
			b.setBank(bank);
		}

		@Override
		public String toString() {
			return "PlayerData [name=" + p.getName() + ", bank=" + b.getBank() + "]";
		}public String csvFormat() {
			return p.getName() + ", " + b.getBank();
		}

	}}
