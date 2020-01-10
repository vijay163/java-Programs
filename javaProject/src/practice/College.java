package practice;

import java.awt.event.ItemEvent;
import java.util.HashMap;

public class College {
	int strength;
	String cources;
	double fees;
	boolean available;
	public College(int strength, String cources, double fees, boolean available) {
		super();
		this.strength = strength;
		this.cources = cources;
		this.fees = fees;
		this.available = available;
	}
	public College() {
		
	}
	@Override
	public String toString() {
		return "College [strength=" + strength + ", cources=" + cources + ", fees=" + fees + ", avalilable="
				+ available + "]";
	}
	public void setAvailablity(boolean available )
	{
		this.available=available;
	}
}
	