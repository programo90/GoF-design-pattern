package templateMethod;

public class TemplateMethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDisplay d1 = new CharDisplay('H');
		d1.display();
		
		AbstractDisplay d2 = new StringDisplay("hello");
		d2.display();
		
		AbstractDisplay d3 = new StringDisplay("æ»≥Á«œººø‰");
		d3.display();
		
	}

}
