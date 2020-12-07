package abstractFactory;

import abstractFactory.factory.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main listFactory.ListFactory");
			System.out.println("Example 2: java Main tableFactory.TableFactory");
			System.exit(0);
		}
		
		Factory factory = Factory.getFactory(args[0]);
		
		Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
		Link chosun = factory.createLink("조선일보", "http://www.chosun.com/");
		
		Link naver = factory.createLink("네이버", "http://www.naver.com/");
		Link google = factory.createLink("구글", "http://www.google.com/");
		
		Tray traynews = factory.createTray("신문");
		traynews.add(joins);
		traynews.add(chosun);
		
		
		Tray traysearch = factory.createTray("검색엔진");
		traysearch.add(naver);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkePage", "영진닷컴");
		page.add(traynews);
		page.add(traysearch);
		page.output();
		
	}

}
