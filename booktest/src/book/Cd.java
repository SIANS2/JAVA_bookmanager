package book;

public class Cd extends Rental {
	private int cdRank;
	private int cdAgeOfUse;
	public int getCdRank() {
		return cdRank;
	}
	public void setCdRank(int cdRank) {
		this.cdRank = cdRank;
	}
	public int getCdAgeOfUse() {
		return cdAgeOfUse;
	}
	public void setCdAgeOfUse(int cdAgeOfUse) {
		this.cdAgeOfUse = cdAgeOfUse;
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

