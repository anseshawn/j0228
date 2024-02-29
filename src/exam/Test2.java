package exam;

import java.util.Scanner;

/*
	2번 : 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되,
	이때 5개항씩 그 결과를 출력시켜주시오.(마지막에 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함)
	여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다.
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1, su2, tot=0, temp=0, cnt=0, total=0, startSu;
	
		System.out.print("첫번째 수를 입력하세요: ");
		su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		su2 = sc.nextInt();
		
		System.out.println("첫번째 수: "+su1+", 두번째 수: "+su2); //if문 거치기 전에(두 수가 바뀌기 전에) 출력
		
		if(su1 > su2) {
			temp = su1;
			su1 = su2;
			su2 = temp;
		} //if문을 거치면 su1은 항상 su2보다 작다
		
		startSu = temp = su1; //총합 출력을 위한 고정 숫자 지정
		
		while (su1 <= su2) { //0부터 시작이 아니라 su1자체에서 돌아가기 때문에 <= 이어야 함
			tot += su1;
			total += su1; //tot와 중복 계산을 수행하고 있기 때문에 숫자가 클수록 시간복잡도가 커짐(2_2에서 계속)
			cnt++;
			
			if(cnt % 5 == 0) {
				System.out.println(temp+" ~ "+su1+" : "+tot);
				tot = 0;
				temp = su1 + 1;
			}
			su1++;
		}
		if(cnt % 5 != 0) System.out.println(temp+" ~ "+ --su1+" : "+tot);
		System.out.println("총합("+startSu+"~"+su2+") : "+total);
		sc.close();
	}
}
