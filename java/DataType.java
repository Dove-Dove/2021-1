
public class DataType {
	public static int fack1(int n){
		int tmp=1;
		for (int i =2; i<=n; i++) {
			tmp = tmp * i;
			}
		return tmp;
		}
		public static int fack2(int n){
				if (n== 0)
					return 1;
				else
					return n * fack2(n-1);
				
			}
		 public static void main(String[] args) {
			 System.out.println(fack1(5));
			 System.out.println(fack2(5)); 
		 }
	  
}
