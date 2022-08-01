package book;
import java.util.*;
/**
 * 
 * @author 강시안
 * 작성일 : 2022-07-26
 * 책 / CD 관리 프로그램
 * 책/CD정보를 등록 검색 삭제 수정하는 프로그램
 */


 /** Rental 클래스를 상속 받는 클래스 */
    class BookManager extends Rental {
 	
    ArrayList<BookManager> list = new ArrayList<>();

 	public BookManager(){}
   
 	public BookManager(String rentalName, int rentalNum,
 		   String rentalAuthor, Boolean rentalPossible) {
 	this.rentalname=rentalname;
    this.rentalnum=rentalnum;
    this.rentalauthor=rentalauthor;
    this.rentalPossible=rentalPossible;
    
 	}
    
 	
 	/** 책/CD 정보를 등록하는 클래스 */
    public void Resister(){
        Scanner sc = new Scanner(System.in);
        BookManager rental = new BookManager();
        
        System.out.println("책/CD 제목 : ");        
        rental.rentalname = sc.next();
        System.out.println("발행일자 : ");
        rental.rentalnum = sc.nextInt();
        System.out.println("저자 : ");
        rental.rentalauthor = sc.next();
        System.out.println("대출여부 : ");
        rental.rentalPossible = sc.nextBoolean();
 
        
        list.add(rental);
    } 
    
    
    
	/** 책/CD 정보를 수정하는 클래스 */
    public void Update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("책/CD 제목 : ");        
        rentalname = sc.next();
        boolean check = false;
 
        for (int i = 0; i < list.size() ; i++)
        {
        	System.out.println("list.size(): "+list.size()+" rentalname="+list.get(0).getrentalName());
            if(list.get(i).getrentalName().equals(rentalname)){
                
                System.out.println("수정할 책/CD 제목 입력 : ");
                String rentalName = sc.next();
                System.out.println("수정할 발행일자 입력 : ");
                int rentalNum= sc.nextInt();
                System.out.println("수정할 저자 명 입력 : ");
                String rentalAuthor = sc.next();
                System.out.println("수정할 대출여부 입력 : ");
                Boolean rentalPossible= sc.nextBoolean();
 
 
                list.set(i,new BookManager());
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("해당 책이 없습니다.");
        }
    }
    
    
    
    
	/** 책/CD 정보를 검색하는 클래스 */
    public void Search(){//검색 메서드
 
        Scanner sc = new Scanner(System.in);
        System.out.println("책/CD 제목 : ");        
        rentalname = sc.next();
        boolean check = false;
 
        for (int i = 0; i < list.size() ; i++)
        {
            if(list.get(i).getrentalName().equals(rentalname)){
                System.out.println(list.get(i).info());
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("해당 책/CD 정보가 없습니다.");
        }
    }
 
    
	
	/** 책/CD 정보를 삭제하는 클래스 */
    public void Delete(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("책/CD 제목 : ");        
        rentalname = sc.next();
        boolean check = false;
 
        for (int i = 0; i < list.size() ; i++)
        {
            if(list.get(i).getrentalName().equals(rentalname)){
                list.remove(i);
                System.out.println(rentalname+"의 정보가 삭제되었습니다.");
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("해당 책/CD 정보가 없습니다.");
        }
    }
    
   
    
	/** 책/CD 정보를 전체 출력하는 클래스 */
    public void print(){
        Iterator<BookManager> it = list.iterator();
        while(it.hasNext()){
            BookManager bm = it.next();
            System.out.println(bm.info());
        }
    }
 
    public String info(){
        return "책/CD제목 : " + rentalname + "/n발행일자 : " + rentalnum + "/n저자 : "
    + rentalauthor + "/n대출여부 : "+rentalPossible;  }
   
    

	@Override
	void getInfo() {
		return;
		}



	}
	



 








