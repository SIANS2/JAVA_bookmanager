package book;

import java.util.Scanner;
/**
 * 
 * @author ���þ�
 * �ۼ��� : 2022-07-26
 * å / CD ���� ���α׷�
 * å/CD������ ��� �˻� ���� �����ϴ� ���α׷�
 */

/** å/cd���� ���� ���� Ŭ���� */
public class BookMain
{
    public static void main(String[] args) 
    {
        System.out.println("--------------------");
        Scanner sc = new Scanner(System.in);
        BookManager rental = new BookManager();
 
        int order = 0;
        while(order != 6){
            System.out.println("1.å/CD ��� 2.å/CD ���� 3.å/CD �˻� 4.å/CD ���� 5.��ü å/CD ������� 6.����");
            order = sc.nextInt();
            switch (order)
            {
                case 1 :
                    System.out.println("å/CD ������ �߰��մϴ�.\nå/CD ����, ��������, ����, ���⿩�θ� �Է����ּ���");
                    rental.Resister();
                    break;
                case 2 :
                    System.out.println("å/CD ������ �����մϴ�.\nå/CD ������ �Է����ּ���");
                    rental.Update();
                    break;
                case 3 :
                    System.out.println("å/CD ������ �˻��մϴ�.\\nå/CD ������ �Է����ּ���");
                    rental.Search();
                    break;
                case 4 :
                    System.out.println("å/CD ������ �����մϴ�.\\nå/CD ������ �Է����ּ���");
                    rental.Delete();
                    break;
                case 5 :
                    System.out.println("å/CD ������ ��ü ����մϴ�.");
                    rental.print();
                    break;
                case 6 :
                    System.out.println("������ �ý����� �����մϴ�.");
                    break;
                default :
                    System.out.println("�ٽ� �Է� �� �ּ���.");
            }
            
        }
    }
}

