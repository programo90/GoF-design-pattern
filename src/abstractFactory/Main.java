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
		
		Link joins = factory.createLink("�߾��Ϻ�", "http://www.joins.com/");
		Link chosun = factory.createLink("�����Ϻ�", "http://www.chosun.com/");
		
		Link naver = factory.createLink("���̹�", "http://www.naver.com/");
		Link google = factory.createLink("����", "http://www.google.com/");
		
		Tray traynews = factory.createTray("�Ź�");
		traynews.add(joins);
		traynews.add(chosun);
		
		
		Tray traysearch = factory.createTray("�˻�����");
		traysearch.add(naver);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkePage", "��������");
		page.add(traynews);
		page.add(traysearch);
		page.output();
		
	}

}
