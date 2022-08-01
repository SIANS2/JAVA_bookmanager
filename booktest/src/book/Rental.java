package book;

abstract public class Rental{

	  protected String rentalname;
	  protected int rentalnum;
      protected String rentalauthor;
      protected boolean rentalPossible;
      
      public String getrentalName() {
         return rentalname;
      }
      public void setrentalName(String rentalname) {
         this.rentalname = rentalname;
      }
      public int getrentalNum() {
         return rentalnum;
      }
      public void setrentalNum(int rentalnum) {
         this.rentalnum = rentalnum;
      }
      public String getrentalAuthor() {
         return rentalauthor;
      }
      public void setrentalAuthor(String rentalauthor) {
         this.rentalauthor = rentalauthor;
      }
      public boolean getrentalPossible() {
         return rentalPossible;
      }
      public void setAvailable(boolean rentalPossible) {
         this.rentalPossible = rentalPossible;
      }
      abstract void getInfo();


}


