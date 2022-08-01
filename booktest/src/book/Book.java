package book;

public class Book extends Rental {
	private String bookGenre;
	private int bookPrice;
	private String bookPubli;
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	} 
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookPubli() {
		return bookPubli;
	}
	public void setBookPubli(String bookPubli) {
		this.bookPubli = bookPubli;
	}
	void getInfo() {
  	  System.out.println("이름: " +  getrentalName());
  	  System.out.println("번호: " + getrentalNum());
  	  System.out.println("작가: " + getrentalAuthor());
  	  System.out.print("대여 가능 여부: ");
  	  if(getrentalPossible() == true) {
  		  System.out.println("가능");
  	  }
  	  else
  		  System.out.println("불가능");
    };
		
	}


