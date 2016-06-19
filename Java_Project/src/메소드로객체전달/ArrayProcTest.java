package 메소드로객체전달;


public class ArrayProcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3,4,5};
		ArrayProc obj = new ArrayProc();
		
		obj.inc(list); //inc() 메소드로 배열 변경하면 원본도 변경
		
		for (int i =0; i<list.length; i++)
			System.out.print(list[i]+" ");
	}

}
