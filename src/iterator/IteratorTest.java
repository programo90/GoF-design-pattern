package iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Git-GitHub"));
		bookShelf.appendBook(new Book("Network-design"));
		bookShelf.appendBook(new Book("Design-pattern"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Book book;
			if(obj instanceof Book) {
				book = (Book)obj;
				System.out.println(book.getName());
			}
		}
	}

}
