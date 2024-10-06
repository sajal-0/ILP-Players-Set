package cam.controller;

import java.util.HashSet;
import java.util.Set;

import cam.entity.Player;
import cam.service.PlayerService;



public class PlayerController {
	
	  PlayerService playerSer = new PlayerService();
	  
	  public Set<Player> allBatterInIPL(){
		  
		  Set<Player> allbatters = playerSer.allPlayerlist();
		  
		  Set<Player> set = new HashSet<>(allbatters);
		  
		  return set;
	  }
	  
	  public Set<Player> allAllrounderIPL(){
		  Set<Player> allrounder = playerSer.allAllrounders();
		  
		  Set<Player> set = new HashSet<>(allrounder);
		  
		  return set;
	  }
	  public Set<Player> allBowlerIPL(){
		  Set<Player> bowler = playerSer.allBowlers();
		  
		  Set<Player> set = new HashSet<>(bowler);
		  
		  return set;
	  }
	  public Set<Player> rcbBattersIPL(){
		  Set<Player> rcbbatter = playerSer.rcbBatters();
		  
		  Set<Player> set = new HashSet<>(rcbbatter);
		  
		  return set;
	  }
	  public Set<Player> miBattersIPL(){
		  Set<Player> mibatter = playerSer.miBatters();
		  
		  Set<Player> set = new HashSet<>(mibatter);
		  
		  return set;
	  }
	  public Set<Player> cskBattersIPL(){
		  Set<Player> cskbatter = playerSer.cskBatters();
		  
		  Set<Player> set = new HashSet<>(cskbatter);
		  
		  return set;
	  }
	  public Set<Player> rcbBowlersIPL(){
		  Set<Player> rcbbowler = playerSer.rcbBowlers();
		  
		  Set<Player> set = new HashSet<>(rcbbowler);
		  
		  return set;
	  }
	  	
	  public Set<Player> miBowlersIPL(){
		  Set<Player> mibowler = playerSer.miBowlers();
		  
		  Set<Player> set = new HashSet<>(mibowler);
		  
		  return set;
	  }
	  public Set<Player> cskBowlersIPL(){
		  Set<Player> cskbowler = playerSer.cskBowlers();
		  
		  Set<Player> set = new HashSet<>(cskbowler);
		  
		  return set;
	  }
	  public Set<Player> nameStartWithIPL(){
		  Set<Player> start = playerSer.nameStartWith();
		  
		  Set<Player> set = new HashSet(start);
		  
		  return set;
	  }
	  	
	  	

     
}
