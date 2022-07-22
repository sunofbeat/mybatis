package ch02.domain;

import java.time.LocalDate;


public class User { 
	//���� users relation�� mapping �� User object�� �������϶�.
	private int userId;
	private String userName;
	private LocalDate regDate;
	
	public User(int userId, String userName, LocalDate regDate) {
		this.userName = userName;
		this.userId = userId;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return String.format("%d %s %s", userId, userName, regDate);
	}

}
