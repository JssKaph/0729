import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("정수 한 개 : ");
		int su = sc.nextInt();
		sc.nextLine();
		System.out.println(su + "는" +((su%2==0) ? "짝수 입니다" : "홀수 입니다."));
		System.out.print("Again(y/n)? : ");
		String q = sc.nextLine();
		if(q.equals("n") || q.equals("N")) 
				break;
		}
		System.out.println("프로그램 종료");
	}
}
