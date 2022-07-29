import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
		// 1부터 100까지 모두 더하는 for 문
//		int sum = 0;
//		for (int i=1; i<=100; i++) {
//			sum+= i; //sum = sum + i;
//		}
//		System.out.println("sum = " + sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 factorial :");
		int su = sc.nextInt();
		int result = 1;
		for (int i = su; i >= 1; i--) { // i가 su 부터 1보다 크거나 같을때까지 i 감소
			result*= i; // result = result * i;		
		}
		System.out.printf("%d! = %d\n", su, result );
		
		
	}
}
