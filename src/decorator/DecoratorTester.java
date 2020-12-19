package decorator;

public class DecoratorTester {

	public static void main(String[] args) {
		Display d1 = new StringDisplay("Hollo, World.");
		Display d2 = new SideBorder(d1, '#');
		Display d3 = new FullBorder(d2);
		d1.show();
		d2.show();
		d3.show();
		
		Display d4 = new SideBorder(
				new FullBorder(
						new FullBorder(
								new SideBorder(
										new FullBorder(
												new StringDisplay("æ»≥Á«œººø‰.")),'*'))),'/');

		d4.show();
	}

}
