package uGame;

import javax.activity.InvalidActivityException;

public class Student {
	
	private String name;
	private int XP;
	
	public Student(String name) {
		this.name = name;
		this.XP = 0;
	}
	
	public void addXP(int newXP) throws InvalidActivityException {
		if ((this.XP + newXP)<0) {
			throw new InvalidActivityException();
		}
		this.XP += newXP;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getXP() {
		return this.XP;
	}
	
	public String toString() {
		return this.name + ": " + XP + " XP";
	}
	
	@ForTestingOnly
	public void resetXP() {
		this.XP = 0;
	}

}
