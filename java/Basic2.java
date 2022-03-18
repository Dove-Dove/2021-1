package week03;

public class Basic2 {
	public static void main(String[] args) {
		for(int i = 0; i<=10;i++) {
			System.out.print(i);
		}
		System.out.println("1,3,5,7,9");
		for(int i = 0; i<=10;i+=2) {
			System.out.println(i);
		}
		for(int i = 0; i<=10;i++) {
			if(i%2==1)
			System.out.print(i);
		}
		for(int i = 0; i<=10;i++) {
			if(i%2==0)
				continue;
			System.out.print(i);
		}
		
		for(int k = 0;k<10; k++) {
			System.out.print(k);
		}
		System.out.println();
	//	System.out.println(k);
		int a=0;
		while ( a<10) {
			if(a%2 == 1)
				System.out.println(a);
			a++;
			
		}
	}
}
