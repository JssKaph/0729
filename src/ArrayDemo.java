
public class ArrayDemo {
	public static void main(String[] args) {
//		int a; //declaration
//		a = 10; //assignment
//		int b = 5; //initialization
//		
//		int [] array; // 배열 선언 Declaration 
//		array = new int [4]; // new /종류 /갯수 (주소선언) Assignment
//		int [] array1 = {1, 2, 3, 4};
		
		//<<int>>
		//1st way 이 방법은 배열 값을 100개 정도의 많은 수를 할당할때에 너무 불편하다. 
//		int [] array;
//		array = new int[4];
//		array[0]=4; array[1]=2; array[2]=9; array[3]=5;
		
		//2nd way
//		int [] array;
//		array = new int[] {4, 2, 9, 5};
		
		//3rd way
//		int [] array = {4, 2, 9, 5};
		//3rd way 의 단점
//		int [] array; 
//		array = {4, 2, 9, 5} // 초기화와 선언을 따로 할 수 없음
		
		//<<double>>
		//1st way
//		double [] array;
//		array = new double [3];
//		array[0] = 67.9; array[1] = 43.7; array[2] = 56.2;
		
		//2nd way
//		double [] array;
//		array = new double[] {67.9, 43.7, 56.2};
		
		//3rd way
//		double [] array = {67.9, 43.7, 56.2};
		
		//<<char>>
		//1st way
//		char[] array;
//		array = new char [3];
//		array[0] = 'A'; array[1] = 'B'; array[2] = 'C'; 
		
		//2nd way
//		char [] array;
//		array = new char {'A','B','C'};
		
		//3rd way
//		char [] array = {'A', 'B', 'C'};
		
		//<<boolean>>
		//1stway
//		boolean []  array ;
//		array = new boolean [3];
//		array[0] = true; array[1] = false; array[2] = false;
		
		//2nd way
//		boolean [] array;
//		array = new boolean [] {true,false,false};
		
		//3rd way
		boolean [] array = {true, false, false};
		
		for(int i =0; i<3; i++) {
			System.out.println("array[" + i + "] = " +array[i]);
		}
		
		//<<String>>
		//1st way
//		String [] array;
//		array = new String [3];
//		array [0] = "한지민"; array [1] = "Michael Jackson"; array[2] = "Henry"; 
		// 배열안에는 4byte의 동일한 값이 저장되지만 객체 배열은 주소만 저장하니까 상관없다.
		// 값을 저장하던지 주소를 저장하던지 자유롭게 된다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
