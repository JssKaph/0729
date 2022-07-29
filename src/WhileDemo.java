
public class WhileDemo {
	public static void main(String[] args) {
//		int i = 2;
//		while(i<10) {
//			int j = 1;
//			while(j<10) {
//				j++;
//				System.out.printf("%dX%d = %d\t\t",i ,j ,i*j);
//			}
//			i++;
//			System.out.println();
//		}// while문 마다 바깥쪽에 초기값, 끝에 증감값을 넣어줘야 한다.	
		
		int cnt1 = 0;
		int cnt2 = 0;
		int i = 65;
		while (i<91) {
			if (cnt1 % 5 ==0) {
				System.out.println();
			cnt2++;
			}
			if (cnt2 % 2 == 0) {
				System.out.printf("%c", i+32);
			}
			else System.out.printf("%c", i);
			cnt1++;
			i++;
			
		}
	}
}
