package assignment;

import java.util.Comparator;

public	class SortByName implements Comparator<song>
{

	
	public int compare(song Name1, song Name2) {
	
		return Name1.name.compareTo(Name2.name);
	}
	
}

