package cam.Dau;

import java.util.HashSet;
import java.util.Set;

import cam.entity.Player;

public class PlayerDau {
	
	public Set<Set<Player>> teams = new HashSet<>();
	public Set<Player> rcb = new HashSet<>();
	public Set<Player> mi = new HashSet<>();
	public Set<Player> csk = new HashSet<>();
	
	public Set<Set<Player>> allPlayers(){
		// Clear existing sets in case this method is called multiple times
		 rcb.clear();
	        mi.clear();
	        csk.clear();
		
		
		
		rcb.add(new Player("AB de Villiers", 17, 10000, 59, "RCB"));
		rcb.add(new Player("Faf du Plessis", 19 , 8000, 5, "RCB"));
		rcb.add(new Player("Mohammed Siraj", 13 , 900, 229, "RCB"));
		rcb.add(new Player("Yuzvendra Chahal", 03, 650, 289, "RCB"));
		rcb.add(new Player("Glenn Maxwell", 32, 7000, 60, "RCB"));
		rcb.add(new Player("Virat Kohli", 18 , 11000, 4, "RCB"));
		rcb.add(new Player("Harshal Patel", 24 ,1500, 100, "RCB"));
		rcb.add(new Player("Wanindu Hasaranga",99, 1200, 150, "RCB"));

		csk.add(new Player("MS Dhoni",07, 7000, 7, "CSK"));
		csk.add(new Player("Ravindra Jadeja",8, 5001, 150, "CSK"));
		csk.add(new Player("Ruturaj Gaikwad",31, 10000, 29, "CSK"));
		csk.add(new Player("Moeen Ali",18, 7000, 75, "CSK"));
		csk.add(new Player("Deepak Chahar",90, 800, 65, "CSK"));
		csk.add(new Player("Dwayne Bravo",47, 2000, 170, "CSK"));
		csk.add(new Player("Ambati Rayudu", 9, 6000, 8, "CSK"));
		csk.add(new Player("Devon Conway", 88, 3500, 12, "CSK"));

		mi.add(new Player("Rohit Sharma",45, 9000, 15, "MI"));
		mi.add(new Player("Jasprit Bumrah", 93, 600, 200, "MI"));
		mi.add(new Player("Suryakumar Yadav",63, 8000, 51, "MI"));
		mi.add(new Player("Ishan Kishan",23, 7000, 18, "MI"));
		mi.add(new Player("Kieron Pollard", 55, 10000, 25, "MI"));
		mi.add(new Player("Hardik Pandya",33, 5500, 55, "MI"));
		mi.add(new Player("Trent Boult",18, 1100, 150, "MI"));
		mi.add(new Player("Rahul Chahar",28 , 800, 90, "MI"));
		
		teams.add(rcb);
		teams.add(mi);
		teams.add(csk);
		
		return teams;
	}
	public PlayerDau() {
		allPlayers();
	}
	
}
