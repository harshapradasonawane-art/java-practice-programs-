package com.tka.janA1;

public class Player {
	


	private int p_id;
	private int j_no;
	private String p_name;
	private int runs;
	private int wickets;
   private String team_name;

	public Player() {
		
	}

	public Player(int p_id, int j_no, String p_name, int runs, int wickets, String team_name) {
		super();
		this.p_id = p_id;
		this.j_no = j_no;
		this.p_name = p_name;
		this.runs = runs;
		this.wickets = wickets;
		this.team_name = team_name;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getJ_no() {
		return j_no;
	}

	public void setJ_no(int j_no) {
		this.j_no = j_no;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
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

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	@Override
	public String toString() {
		return "Player [p_id=" + p_id + ", j_no=" + j_no + ", p_name=" + p_name + ", runs=" + runs + ", wickets="
				+ wickets + ", team_name=" + team_name + "]";
	}


	}

	
