
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=32,y=256,r;
		
		while(y!=0){
			r=x%y;
			x=y;
			y=r;
		}
		System.out.println(x);
		System.out.printf("%%");
	}
	
}
