package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

final  class Laptop
{
	public int ram_size;
	public double processor_speed;
	Laptop(){}
	public Laptop(int ram_size, double processor_speed) {
		super();
		this.ram_size = ram_size;
		this.processor_speed = processor_speed;
	}
	public void displayConfig()
	{
		System.out.println("**ramSize"+ram_size);
		System.out.println("**processorSpeed"+processor_speed);
	}

}
class SortByProcessorSpeed implements Comparator
{


@Override
public int compare(Object o1, Object o2) {
	Laptop l1=(Laptop)o1;
	Laptop l2=(Laptop)o2;
	if(l1.processor_speed==l2.processor_speed)
	return 0;
	else
		if(l1.processor_speed>l2.processor_speed)
		return 1;
	else
		return -1;
		
}
}
class SortByRam implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		return l1.ram_size-l2.ram_size;
	}
}
public class Comporator {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
	al.add(new Laptop(4,5.4));
	al.add(new Laptop(8,4.1));
	al.add(new Laptop(16,9.0));
	System.out.println("To sort based on Processor speed");
	Collections.sort(al,new SortByProcessorSpeed());
	for(Object a:al)
	{
		Laptop temp=(Laptop)a;
		temp.displayConfig();

	}
	System.out.println("****************************");
	System.out.println("to Sort based on ramSize");
	Collections.sort(al,new SortByRam());
	for(Object s:al)
	{
		Laptop temp=(Laptop)s;
		temp.displayConfig();
	}
	
	}
}