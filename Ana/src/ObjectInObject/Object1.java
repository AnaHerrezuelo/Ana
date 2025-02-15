package ObjectInObject;

public class Object1 {
	
	String title, isbn;
	int pages;
	
	public Object1() {	
	}
	
	public Object1(String title, String isbn, int pages) {
		if(pages<0) {
			this.pages = 0;
		}else {
			this.pages = pages;
		}
	}

	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Object1 [title=" + title + ", isbn=" + isbn + ", pages=" + pages + "]";
	}




}
