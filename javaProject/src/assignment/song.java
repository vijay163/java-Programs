package assignment;

import java.util.Comparator;
import java.util.TreeSet;

public class song implements Comparable<song>
{
   int yor;
 String name;
double duration;
	public song(){}
	
	public song(int yor, String name, double duration) {
		super();
		this.yor = yor;
		this.name = name;
		this.duration = duration;
	}


	public int compareTo(song s) {
		if(this.duration>s.duration)
			return 1;
		else if(this.duration<s.duration)
			return -1;
		else
		return 0;
	}

	public String toString() {
		return "song [year=" + yor + ", name=" + name + ", duration=" + duration + "]";
	}
}
 
	



