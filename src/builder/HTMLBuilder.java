package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder{

	private String filename;
	private PrintWriter pw;
	
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		filename = title+".html";
		try {
			pw = new PrintWriter(new FileWriter(filename));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		pw.println("<html><head><title>"+title+"</title></head><body>");
		pw.println("<h1>"+title+"</h1>");
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub
		pw.println("<p>"+str+"</p>");
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		pw.println("<ul>");
		for(int i=0; i<items.length; i++) {
			pw.println("<li>"+items[i]+"</li>");
		}
		pw.println("</ul>");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		pw.println("</body></html>");
	}
	
	public String getResult() {
		return filename;
	}

}
