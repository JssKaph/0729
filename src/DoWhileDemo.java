
public class DoWhileDemo {
	public static void main(String[] args) {
		//1~10까지 출력 (for문) 
		for(int i = 1; i<11; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		//while 문
		int j =1; // 초기치
		while (j<11) { //	조건
			System.out.print(j+"\t");
			j++; // 증감
		}
		System.out.println();
		//do while 문
		int k =1; // 초기치
		do { // 조건
			System.out.print(k+"\t");
			k++; // 증감
		}
			while (k<11);
	}
}
