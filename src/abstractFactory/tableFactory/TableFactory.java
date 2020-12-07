package abstractFactory.tableFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Link;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

public class TableFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tray createTray(String caption) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
