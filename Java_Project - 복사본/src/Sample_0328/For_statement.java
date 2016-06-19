package Sample_0328;

public class For_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++){
			System.out.println(i);
		}
		for(int j=100; j>=10; j-=10){
			System.out.println(j); 
		}
		for(int j=10; j>=1; j--){
			System.out.println(j*10); 
		}
		int j=10;
		for(; j>=1 ;){
			System.out.println(j*10); 
			j--;
		}
		int k=10;
		while(k>=1){
			System.out.println(k*10); 
			k--;
		}
		
	}

}
