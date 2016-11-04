package homework7;
import java.util.Scanner;
public class AptPersonCount 
{ public void apc(){ 
Scanner s= new Scanner(System.in); 
Scanner d = new Scanner(System.in); 
int A[][] = new int[5][3];  int j=1;  int total=0; 
System.out.println("5층 아파트의 거주자 인원 파악하기"); 
for(int i=1; i<=5;i++){  
System.out.println(i+"0"+j+"호에 살고 있는 사람의 숫자:" ); 
A[i][j] = s.nextInt();  
total+= A[i][j];  
for(j=1 ;j<=3;j++){  
System.out.println(i+"0"+j+"호에 살고 있는 사람의 숫자:"); 
A[i][j]=d.nextInt();   total += A[i][j];   }     
System.out.println("이 아파트의 거주자는 모두"+ total+"입니다" );  
System.out.println("1층에 사는 거주자는 모두"+(A[1][1]+A[1][2]+A[1][3]) +"입니다" );
System.out.println("2층에 사는 거주자는 모두"+(A[2][1]+A[2][2]+A[2][3]) +"입니다" ); 
System.out.println("3층에 사는 거주자는 모두"+(A[3][1]+A[3][1]+A[3][3]) +"입니다" ); 
System.out.println("4층에 사는 거주자는 모두"+(A[4][1]+A[4][2]+A[4][3]) +"입니다" ); 
System.out.println("5층에 사는 거주자는 모두"+(A[5][1]+A[5][2]+A[5][3]) +"입니다" ); 
System.out.println("1호라인에 사는 거주자는"+(A[1][1]+A[2][1]+A[3][1]+A[4][1]+A[5][1])+"입니다");
System.out.println("2호라인에 사는 거주자는"+(A[1][2]+A[2][2]+A[3][2]+A[4][2]+A[5][2])+"입니다");  
System.out.println("3호라인에 사는 거주자는"+(A[1][3]+A[2][3]+A[3][3]+A[4][3]+A[5][3])+"입니다"); 
}    } }
