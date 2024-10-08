package com.entity;

import java.util.Map;

public class Player {

	private String name;
	private int jerseyno;
	private int runs;
	private int wickets;
	private String year;
	private String teamname;

	public Player() {
		super();
	}

	public Player(String name, int jerseyno, int runs, int wickets, String teamname, String year) {
		super();
		this.name = name;
		this.jerseyno = jerseyno;
		this.runs = runs;
		this.wickets = wickets;
		this.teamname = teamname;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyno() {
		return jerseyno;
	}

	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
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

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Player [Name = " + name + ", runs = " + runs + ", wickets = " + wickets + ", year = " + year
				+ ", teamname = " + teamname + " ]";
	}

}
