package adapter;

public class AdapterTester {
	public static void main(String[] args) {
		Print p = new PrintBanner("hello");
		p.printWeak();
		p.printStrong();
		
		PrintBanner2 p2 = new PrintBanner2("hello");
		p2.printWeak();
		p2.printStrong();
	}

}
