package org.cj.java.training.lambaexpressions;

import java.util.ArrayList;
import java.util.List;

import org.cj.java.training.annotations.declaring.ClassPreamble;

@ClassPreamble(author = "Chathuranga", 
currentRevision = 1.1, date = "4/12/2020", modifiers = { "Chathuranga" })
public class LambadaExpressionsApp {
	
	public static void main(String[] args) {
		LambadaExpressionsApp app = new LambadaExpressionsApp();
		app.showBatsmens();
	}

	private List<Player> players;
	{
		players = new ArrayList<>();
		players.add(new Player("Sanga", Role.BATSMAN));
		players.add(new Player("Murali", Role.BOWLER));
		players.add(new Player("Mahela", Role.BATSMAN));
		players.add(new Player("Dilshan", Role.BATSMAN));
	}
	
	private void showBatsmens() {
		players.stream()
		.filter(cus -> cus.role.equals(Role.BATSMAN))
		.map((cus) -> cus.name)
		.forEach(name -> System.out.println(name + " is a batsman."));
	}
	
	private class Player {
		
		private String name;
		private Role role;
		
		private Player (String name, Role role) {
			this.name = name;
			this.role = role;
		}

	}
	
	private enum Role {
		BOWLER, BATSMAN
	}
}
