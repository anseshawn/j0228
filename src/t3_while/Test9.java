package t3_while;

//
public class Test9 {
	public static void main(String[] args) {
		
		int odd = 0, even = 0, i = 0; 
		
		while(i < 100) { //i의 범위 조건 주의
			i = i + 1;
			odd = odd + i;
			i = i + 1;
			even = even + i;
		}
		System.out.println("1~100까지의 홀수합은 "+odd+", 짝수합은 "+even);
	}
}
