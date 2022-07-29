
public class DoWhileDemo2 {
	public static void main(String[] args) {
		//1부터 6까지의 랜덤값을 추출하되, 서로 다른 두개를 출력 하는 프로그램
		int dice1;
		int dice2; 
		//for문
		for( ; ; ) {
			dice1 = (int)(Math.random() * 6 + 1);
			dice2 = (int)(Math.random() * 6 + 1);
			if(dice1 != dice2)
				break;
		}
		System.out.printf("dice1 = %d, dice2 = %d", dice1, dice2);
		//while문
		while(true) {
			dice1 = (int)(Math.random() * 6 + 1);
			dice2 = (int)(Math.random() * 6 + 1);
			if(dice1 != dice2)
				break;
		}
		System.out.printf("dice1 = %d, dice2 = %d", dice1, dice2);
		//do while문
		do {
			dice1 = (int)(Math.random() * 6 + 1);
			dice2 = (int)(Math.random() * 6 + 1);
		}
		while (dice1 == dice2); // 같아야 무한 반복 틀리면 끝
		System.out.printf("dice1 = %d, dice2 = %d", dice1, dice2);
		
	}
}
