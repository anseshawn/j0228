package t3_while;

//1~100까지의 합 10항씩의 합을 출력하시오.
/*
 	1~10 : 55
 	1~20 : 210
 	1~30 : ___
 */
public class Test4 {
	public static void main(String[] args) {
		
		int i = 0, tot = 0;
		
		while(i < 100) {
			i = i + 1;
			tot = tot + i;
			if((i % 10) == 0) //수식에 괄호 주의하기
				System.out.println("1 ~ "+i+" : "+tot);
		}
	}
}
