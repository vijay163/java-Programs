package multiThread;

import java.util.Arrays;
import java.util.List;

/*interface con
{
public void trump(String s);	
}
*/public class consumer {
	public static void main(String[] args) {
		List<String> values = Arrays.asList("hari","madhav","mahesh","jani");
           values.forEach(i -> System.out.println(i));
	
	}

}
