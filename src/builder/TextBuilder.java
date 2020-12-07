package builder;

public class TextBuilder extends Builder{

	private StringBuffer sb = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		sb.append("=======================\n");
		sb.append("-"+title+"-\n");
		sb.append("\n");
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub
		sb.append('~' + str +"\n");
		sb.append("\n");
		
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		for(int i=0; i<items.length; i++) {
			sb.append(" *"+items[i]+"\n");
		}
		sb.append("\n");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		sb.append("=======================\n");
	}
	
	public String getResult() {
		return sb.toString();
	}

}
