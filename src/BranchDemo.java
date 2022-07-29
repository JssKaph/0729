import java.util.Scanner;

public class BranchDemo{
	public static void main(String[] args) {
//		for(int i=1; i<101; i++)
//			if(i%7==0)
//				System.out.print(i+"\t");
//			else continue;
//		}
		
//		outer:
//		for(int i =65; i<91; i++) {
//			int j=65; // 초기치
//			inner:
//			while(j<=i) {
//				System.out.printf("%c\t",j);
//				if(j==70) break outer; // outer = goto 같은 탈출문
//				j++;
//			}
//			System.out.println();
//		}
		
		String systemPassword = "ABCD";
		Scanner sc = new Scanner(System.in);
		System.out.print("input password : ");
		String userPassword = sc.nextLine();
		int i;
		for(i=0; i<4; i++) {
			if(systemPassword.charAt(i)==userPassword.charAt(i)) 
				continue; // 계속 자릿수 마다 같으면 다음을 비교함
			else 
				break; // 그렇지 않으면 바로 나가기
		}
		if(i==4) 
			System.out.print("success");
		else 
			System.out.print("failure");
	}	
}
