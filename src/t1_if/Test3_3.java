package t1_if;

import java.util.Scanner;

// 3과목의 점수를 입력받는다. 이때 3과목의 평균 점수가 60점 이상이고 각 과목당 40점 이상이면 '합격', 그렇지 않으면 '불합격'
public class Test3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jum1, jum2, jum3, avg;
		String str = "";
		
		System.out.print("첫 번째 과목의 점수는? "); jum1 = sc.nextInt();
		System.out.print("두 번째 과목의 점수는? "); jum2 = sc.nextInt();
		System.out.print("세 번째 과목의 점수는? "); jum3 = sc.nextInt();
		
		avg = (jum1 + jum2 + jum3) / 3;
		//OR는 하나만 참이어도 참이기 때문에 조건 하나만 만족해도 if문 탈출
		//과목이 하나만 과락이어도 avg 계산 전에 if문을 빠져나올 수도 있기 때문에 계산이 제일 뒤로 가면 프로그램이 빨리 처리됨
		if(avg < 60 || jum1 < 40 || jum2 < 40 || jum3 < 40) {
			str = "불합격";
		}
		else {
			str = "합격";
		}
		
		System.out.println("당신은 "+str+"입니다.");
				
		sc.close();
	}
}
