package t3_while;

//1~100까지의 합 10항씩의 합을 출력하시오.
/*
 	1~10 : 55
 	11~20 : 210
 	21~30 : ___
 */
public class Test5 {
	public static void main(String[] args) {
		
		int i = 0, tot = 0;
		
		while(i < 100) {
			i = i + 1;
			tot = tot + i;
			if((i % 10) == 0) {
				System.out.println((i-9)+" ~ "+i+" : "+tot);
				tot = 0; //clear
			}
		}
	}
}
