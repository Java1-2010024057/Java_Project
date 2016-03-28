package Sample_0328;

public class apartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=9; i>=1; i--){
			for(int j=1; j<=8; j++){
				if(i>=6 && j>=6) break;
				System.out.print((i+ "0" +j)+" ");
			}
			System.out.println(" ");
		}
	}

}
