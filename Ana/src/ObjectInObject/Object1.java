package ObjectInObject;

public class Object1 {
	
	String title, isbn;
	int pages;
	Object2 object2;
	String object22;
	
	public Object1() {	
	}
	
	
//	public Object1(String title, String isbn, int pages, Object2 object2) {
//		super();
//		this.title = title;
//		this.isbn = isbn;
//		this.pages = pages;
//		this.object2 = object2;
//	}
	
	public Object1(String title, String isbn, int pages) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.pages = pages;
		this.object2 =new Object2();
	}


//	public Object1(String title, String isbn, int pages) {
//		if(pages<0) {
//			this.pages = 0;
//		}else {
//			this.pages = pages;
//		}
//	}

	
	
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
	
	//PRINTTERS
	
	public void printToString() {
		System.out.println(toString());
	}


	@Override
	public String toString() {
		return "Object1 [title=" + title + ", isbn=" + isbn + ", pages=" + pages + ", object2=" + object2 + "]";
	}
	
	






}
