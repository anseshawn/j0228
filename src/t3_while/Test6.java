package t3_while;

//1+1+2+1+2+3+ ... + 1+2+...+9+10
public class Test6 {
	public static void main(String[] args) {
		
		int i = 0, tot = 0, h = 0;
		
		while(i < 10) {
			i = i + 1;
			tot = tot + i;
			h = h + tot;
		}
		System.out.println("1+1+2+1+2+3+...+1+2+...+9+10= "+h);
	}
}
