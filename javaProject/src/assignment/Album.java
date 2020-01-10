package assignment;

import java.util.TreeSet;

public class Album
	{
		public  static void main(String[] args) {
			
		song s1 = new song(2002,"yamadonga",5.1);	
		song s2=new song(2001,"robo1",4.3);
		song s3=new song(2008,"rakshashi",6.1);
		TreeSet<song> list = new TreeSet<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("******sort By Duration**");
		System.out.println(list);
	SortByYor s= new SortByYor();
		TreeSet<song> list2=new TreeSet<>(s);
		list2.add(s1);
		list2.add(s2);
		list2.add(s3);
		System.out.println("****Sort By Year***********");
		System.out.println(list2);
		
		TreeSet<song> list3=new TreeSet<>(new SortByName());
		list3.add(s1);
		list3.add(s2);
		list3.add(s3);
		System.out.println("******Sort By Name***********");
		System.out.println(list3);
		
		}

}