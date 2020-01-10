package multiThread;

public class STringBuffer {

	public static void main(String[] args) {
		StringBuffer bf = new StringBuffer("vijay");
		bf.append("kumar");
		bf.replace(0,5,"manoj");
		System.out.println(bf);
		System.out.println("*********************");
		bf.delete(7, 9);
		System.out.println(bf);
	    
	}
}
