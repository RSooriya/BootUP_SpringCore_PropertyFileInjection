package com.sooriya;

public class CricketCoach implements Coach {

	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice bowling for daily 30 mins";
	}

}
