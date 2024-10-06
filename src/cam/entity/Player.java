package cam.entity;

public class Player {
	private String name;
	private int jersey_no;
	private int runs;
	private int wickets;
	private String team;
	
	public Player() {
		super();
	}
	
	

	public Player(String name, int jersey_no, int runs, int wickets, String team) {
		super();
		this.name = name;
		this.jersey_no = jersey_no;
		this.runs = runs;
		this.wickets = wickets;
		this.team = team;
	}



	public int getJersey_no() {
		return jersey_no;
	}



	public void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", jersey_no=" + jersey_no + ", runs=" + runs + ", wickets=" + wickets
				+ ", team=" + team + "]";
	}
	

}
