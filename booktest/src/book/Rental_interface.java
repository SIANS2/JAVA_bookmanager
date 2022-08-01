package book;

public interface Rental_interface {
	  abstract public String getrentalName();
      abstract public void setrentalName(String rentalname);
      abstract public int getrentalNum();
      abstract public void setrentalNum(int rentalnum);
      abstract public String getrentalAuthor();
      abstract public void setrentalAuthor(String rentalauthor);
      abstract public boolean rentalPossible();
      abstract public void setrentalPossible(boolean rentalPossible);
      abstract public void getInfo();
}
