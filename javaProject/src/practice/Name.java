package practice;

import java.util.HashMap;

public class Name
{
public HashMap<Integer,College> name=new HashMap<>();
public void addItem(College i)
{
name.put(i.strength,i);
}

public College getItem(int strength)
{
return name.get(strength); 
}
public boolean searchItem(int strength)
{
	College i = name.get(strength);
	return i.available;
	
	}
public int itemCount()
{
	return name.size();
	
}
}
