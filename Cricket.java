package com.tka.jan15;

public class Cricket {

	private String playerName;
	private int jerseyNumber;
	private String teamName;
	private int runs;
    private int wicket;


   Cricket(String playerName,int jerseyNumber,String teamName,int runs, int wicket){
	   
	   this.playerName = playerName;
	   this.jerseyNumber = jerseyNumber;
	   this.teamName = teamName;
	   this.runs = runs;
	   this.wicket= wicket;
   }

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}

public int getJerseyNumber() {
	return jerseyNumber;
}

public void setJerseyNumber(int jerseyNumber) {
	this.jerseyNumber = jerseyNumber;
}

public String getTeamName() {
	return teamName;
}

public void setTeamName(String teamName) {
	this.teamName = teamName;
}

public int getRuns() {
	return runs;
}

public void setRuns(int runs) {
	this.runs = runs;
}

public int getWicket() {
	return wicket;
}

public void setWicket(int wicket) {
	this.wicket = wicket;
}
}
