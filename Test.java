package com.tka.jan15;

public class Test {
	
	public static void main (String[]args) {
		
		Cricket [] players = new Cricket [5];
		
		players [0] = new Cricket ("virat kohali",18,"RCB",12000,4);
		
		players [1] = new Cricket ("glenn maxwell",32,"RCB",3500,30);
		
		players [2] = new Cricket ("dinesh kartik",19,"RCB",4500,0);
		
		players [3] = new Cricket ("mohammed siraj",73,"RCB",600,85);
		
		players [4] = new Cricket ("faf du plessis",13,"RCB",4500,2);
		
	

	for (int i = 0;i<players.length;i++) {
		
		System.out.println(players[i].getPlayerName()+"|| Jersey:"+players[i].getJerseyNumber()+"||Team:"+
		players[i].getTeamName()+"||Runs:"+players[i].getRuns()+"||Wickets:"+players[i].getWicket());
	}

	}
}
