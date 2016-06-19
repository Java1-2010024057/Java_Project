package Sample_0328;

public class For_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1, j=1; j<7; j++){
			if(j==4) i++;
			System.out.println("i:"+i+",j:"+(j-((i-1)*3)));
		}
		
		for(int x=1;x<=2;x++){
			for(int y=1;y<=3;y++){
				System.out.println(x+" "+y);
			}
		}
	}

}
