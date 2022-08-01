package book;

import java.util.Scanner;
/**
 * 
 * @author 강시안
 * 작성일 : 2022-07-26
 * 책 / CD 관리 프로그램
 * 책/CD정보를 등록 검색 삭제 수정하는 프로그램
 */

/** 책/cd정보 관리 메인 클래스 */
public class BookMain
{
    public static void main(String[] args) 
    {
        System.out.println("--------------------");
        Scanner sc = new Scanner(System.in);
        BookManager rental = new BookManager();
 
        int order = 0;
        while(order != 6){
            System.out.println("1.책/CD 등록 2.책/CD 수정 3.책/CD 검색 4.책/CD 삭제 5.전체 책/CD 정보출력 6.종료");
            order = sc.nextInt();
            switch (order)
            {
                case 1 :
                    System.out.println("책/CD 정보를 추가합니다.\n책/CD 제목, 발행일자, 저자, 대출여부를 입력해주세요");
                    rental.Resister();
                    break;
                case 2 :
                    System.out.println("책/CD 정보를 수정합니다.\n책/CD 제목을 입력해주세요");
                    rental.Update();
                    break;
                case 3 :
                    System.out.println("책/CD 정보를 검색합니다.\\n책/CD 제목을 입력해주세요");
                    rental.Search();
                    break;
                case 4 :
                    System.out.println("책/CD 정보를 삭제합니다.\\n책/CD 제목을 입력해주세요");
                    rental.Delete();
                    break;
                case 5 :
                    System.out.println("책/CD 정보를 전체 출력합니다.");
                    rental.print();
                    break;
                case 6 :
                    System.out.println("관리자 시스템을 종료합니다.");
                    break;
                default :
                    System.out.println("다시 입력 해 주세요.");
            }
            
        }
    }
}

