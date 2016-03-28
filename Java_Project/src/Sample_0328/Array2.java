package Sample_0328;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar= new int[2][3];
		for(int i=0, r=1; i<=1; i++){
			for(int j=0; j<=2; j++, r++){
				ar[i][j]=r;
				System.out.println(ar[i][j]);
			}
		}
		
		int[][] ar2= new int[2][3];
		for(int i=0, r=1; i<=1; i++){
			for(int j=0; j<=2; j++, r++){
				ar2[i][j]=i*3+(j+1);
				System.out.println(ar2[i][j]);
			}
		}
	}

}
