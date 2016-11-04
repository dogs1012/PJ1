package homework7;
import java.util.Scanner;
public class SecondMax {  
  public void sm() {   
    Scanner s =new Scanner(System.in);
    int [] a;   a = new int [10];   int max = 0; 
    System.out.println("10개의 숫자를 입력바다 배열에 저장하고");  
    System.out.println("두번째로 큰 수를 출력하라");  
    System.out.println("-------------------------");  
    for(int i = 0;i<10;i++){  
      System.out.println(i+"번째 수를 입력하시오"+s.nextInt());      }  
    for(int i = 0; i<10;i++){    if(a[i] > a[i+1])    {  
      max = a[i+1];    }   } 
    System.out.println("두번째로 큰 수는 "+max+"입니다"); 
  }
}
