package book;
import java.util.*;
/**
 * 
 * @author ���þ�
 * �ۼ��� : 2022-07-26
 * å / CD ���� ���α׷�
 * å/CD������ ��� �˻� ���� �����ϴ� ���α׷�
 */


 /** Rental Ŭ������ ��� �޴� Ŭ���� */
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
    
 	
 	/** å/CD ������ ����ϴ� Ŭ���� */
    public void Resister(){
        Scanner sc = new Scanner(System.in);
        BookManager rental = new BookManager();
        
        System.out.println("å/CD ���� : ");        
        rental.rentalname = sc.next();
        System.out.println("�������� : ");
        rental.rentalnum = sc.nextInt();
        System.out.println("���� : ");
        rental.rentalauthor = sc.next();
        System.out.println("���⿩�� : ");
        rental.rentalPossible = sc.nextBoolean();
 
        
        list.add(rental);
    } 
    
    
    
	/** å/CD ������ �����ϴ� Ŭ���� */
    public void Update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("å/CD ���� : ");        
        rentalname = sc.next();
        boolean check = false;
 
        for (int i = 0; i < list.size() ; i++)
        {
        	System.out.println("list.size(): "+list.size()+" rentalname="+list.get(0).getrentalName());
            if(list.get(i).getrentalName().equals(rentalname)){
                
                System.out.println("������ å/CD ���� �Է� : ");
                String rentalName = sc.next();
                System.out.println("������ �������� �Է� : ");
                int rentalNum= sc.nextInt();
                System.out.println("������ ���� �� �Է� : ");
                String rentalAuthor = sc.next();
                System.out.println("������ ���⿩�� �Է� : ");
                Boolean rentalPossible= sc.nextBoolean();
 
 
                list.set(i,new BookManager());
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("�ش� å�� �����ϴ�.");
        }
    }
    
    
    
    
	/** å/CD ������ �˻��ϴ� Ŭ���� */
    public void Search(){//�˻� �޼���
 
        Scanner sc = new Scanner(System.in);
        System.out.println("å/CD ���� : ");        
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
            System.out.println("�ش� å/CD ������ �����ϴ�.");
        }
    }
 
    
	
	/** å/CD ������ �����ϴ� Ŭ���� */
    public void Delete(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("å/CD ���� : ");        
        rentalname = sc.next();
        boolean check = false;
 
        for (int i = 0; i < list.size() ; i++)
        {
            if(list.get(i).getrentalName().equals(rentalname)){
                list.remove(i);
                System.out.println(rentalname+"�� ������ �����Ǿ����ϴ�.");
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("�ش� å/CD ������ �����ϴ�.");
        }
    }
    
   
    
	/** å/CD ������ ��ü ����ϴ� Ŭ���� */
    public void print(){
        Iterator<BookManager> it = list.iterator();
        while(it.hasNext()){
            BookManager bm = it.next();
            System.out.println(bm.info());
        }
    }
 
    public String info(){
        return "å/CD���� : " + rentalname + "/n�������� : " + rentalnum + "/n���� : "
    + rentalauthor + "/n���⿩�� : "+rentalPossible;  }
   
    

	@Override
	void getInfo() {
		return;
		}



	}
	



 








