package midterm;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=8; i>=1; i--){
			for (int j=1; j<=6; j++){
				if((7<=i&&i<=8)&&(5<=j&&j<=6)) 
					break;
				else if((5<=i&&i<=6)&&(4<=j&&j<=5))
					continue;
				else if((i==1)&&(4<=j&&j<=5)){
					System.out.print("    ");
					continue;
				}
				System.out.print((i*100+j)+" ");
			}
			System.out.println("");
		}
				
	}

}
