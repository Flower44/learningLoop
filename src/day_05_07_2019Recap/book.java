package day_05_07_2019Recap;

public class book {
	
	String author;
	String title;
	int page;
	int price;
	static int count;
	
	
	public book() {
		count++;
		
	}
public book(String author) {
	this.author=author;
	count++;
	}
public book(String Author, String title) {
	this.author=Author;
	this.title=title;
	count++;
}
public book(String author, String title, int page) {
	this.author=author;
	this.title=title;
	this.page=page;
	count++;
}
public book(String author, String title, int page, int price) {
	this.author=author;
	this.title=title;
	this.page=page;
	this.price=price;
	count++;
}
public String getBookInfo() {
	return "Author is: "+author+"/nTitle: "+title+"/nPage: "+page+"/nPrice: "+price;
}
}
