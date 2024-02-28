package t3_while;

//switch
public class Test10 {
	public static void main(String[] args) {
		
		int odd = 0, even = 0, i = 0, sw = 0; 
		
		while(i < 100) { //i의 범위 조건 주의
			i = i + 1;
			if (sw == 0) {
			odd = odd + i;
			sw = 1;
			}
			else {
			even = even + i;
			sw = 0;
			}
		}
		System.out.println("1~100까지의 홀수합은 "+odd+", 짝수합은 "+even);
	}
}
