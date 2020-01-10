package assignment;

import java.util.Comparator;

public class SortByYor implements Comparator<song>
{


	public int compare(song Song1, song Song2) {
	if(Song1.yor>Song2.yor)
		return 1;
	else if(Song1.yor<Song2.yor)
		return -1;
	else
		return 0;
		
	}
	
}

