package cam.service;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import cam.Dau.PlayerDau;
import cam.entity.Player;

public class PlayerService {

	Scanner sc = new Scanner(System.in);
	PlayerDau dao = new PlayerDau();

	public Set<Player> allPlayerlist() {

		Set<Player> allbatter = new HashSet<>();

		for (Set<Player> team : dao.teams) {
			for (Player player : team) {
				if (player.getRuns() > 5000) {
					allbatter.add(player);
				}
			}
		}
		return allbatter;
	}

	public Set<Player> allAllrounders() {
		Set<Player> allrounder = new HashSet<>();
		for (Set<Player> team : dao.teams) {
			for (Player player : team) {
				if (player.getRuns() > 5000 && player.getWickets() > 50) {
					allrounder.add(player);
				}
			}
		}
		return allrounder;
	}

	public Set<Player> allBowlers() {
		Set<Player> allBowler = new HashSet<>();

		for (Set<Player> team : dao.teams) {
			for (Player player : team) {
				if (player.getWickets() > 50) {
					allBowler.add(player);
				}
			}
		}

		return allBowler;
	}

	public Set<Player> rcbBatters() {
		Set<Player> rcbBatter = new HashSet<>();

		for (Player player : dao.rcb) {
			if (player.getRuns() > 5000) {
				rcbBatter.add(player);

			}
		}
		return rcbBatter;
	}

	public Set<Player> miBatters() {
		Set<Player> miBatter = new HashSet<>();

		for (Player player : dao.mi) {
			if (player.getRuns() > 5000) {
				miBatter.add(player);

			}
		}
		return miBatter;
	}

	public Set<Player> cskBatters() {
		Set<Player> cskBatter = new HashSet<>();

		for (Player player : dao.csk) {
			if (player.getRuns() > 5000) {
				cskBatter.add(player);

			}
		}
		return cskBatter;
	}

	public Set<Player> rcbBowlers() {
		Set<Player> rcbBatter = new HashSet<>();

		for (Player player : dao.rcb) {
			if (player.getWickets() > 50) {
				rcbBatter.add(player);
			}
		}
		return rcbBatter;
	}
	public Set<Player> miBowlers() {
		Set<Player> miBatter = new HashSet<>();

		for (Player player : dao.mi) {
			if (player.getWickets() > 50) {
				miBatter.add(player);
			}
		}
		return miBatter;
	}
	
	public Set<Player> cskBowlers() {
		Set<Player> cskBatter = new HashSet<>();

		for (Player player : dao.csk) {
			if (player.getWickets() > 50) {
			cskBatter.add(player);
			}
		}
		return cskBatter;
	}
	
	public Set<Player> nameStartWith(){
		Set<Player> start = new HashSet<>();
		
		System.out.println("Enter the character");
		String ch = sc.next();
		
		for(Set<Player> team : dao.teams) {
			for(Player player : team) {
				String playerName = player.getName().trim();
				char trimName = playerName.charAt(0);
				if(ch.equalsIgnoreCase(Character.toString(trimName))) {
					start.add(player);
				}
			}
		}
		
		return start;
	}
	
	
	
	
	
	
	
	
	
	
}
