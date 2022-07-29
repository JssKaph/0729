import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String q;
		do { // do while 문은 do가 while을 대체
		System.out.print("정수 한 개 : ");
		int su = sc.nextInt();
		sc.nextLine();
		System.out.println(su + "는" +((su%2==0) ? "짝수 입니다" : "홀수 입니다."));
		System.out.print("Again(y/n)? : ");
		q = sc.nextLine();  // 지역변수 변경
		// whiledemo1과 다르게 if성립하면 프로그램 무한 루프
		}
		while(q.equals("y") || q.equals("Y")); // while문과 다르게 while문이 제일 아래
		System.out.println("프로그램 종료");
		//이러한 종류는 for문 보단 while문, while문 보다는 do while문이 더 깔끔하다.
	}
}
