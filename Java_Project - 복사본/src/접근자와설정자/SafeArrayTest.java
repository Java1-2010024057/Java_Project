package 접근자와설정자;

public class SafeArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeArray array= new SafeArray(4);
		
		for(int i=0; i<(array.length+1); i++){
			array.put(i,i*10);
		}
	}

}
