package t1_if;

//논리 연산자(!, &&, || not, and, or)
public class Test2 {
	public static void main(String[] args) {
		int su1 = 23, su2 = 24, su3 = 13, max = -99;
		
		if(su1 > su2) {
			if(su1 > su3) {
				max = su1;
			}
			else {
				max = su3;
			}
		}
		else {
			if (su2 > su3) {
				max = su2;
			}
			else {
				max = su3;
			}
		}
		System.out.println("수1: "+su1+", 수2: "+su2+", 수3: "+su3+", max: "+max);
	}
}
