package practice;

public class University {
static	Name n = new Name();
	public static void main(String[] args) {
	n.addItem(new College(300,"loyola",200000,true));
	n.addItem(new College(500,"sirdhardha",400000,true));
	n.addItem(new College(1200,"p.v.p",206000,true));
	n.addItem(new College(1000,"vignan",700000,true));
	n.addItem(new College(400,"klu",30000,true));
	System.out.println(n.itemCount());
	System.out.println(n.getItem(300));
	System.out.println(n.searchItem(400));
	System.out.println();
	}

}
